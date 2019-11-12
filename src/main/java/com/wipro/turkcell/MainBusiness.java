package com.wipro.turkcell;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wipro.models.Cargo;
import com.wipro.models.CargoHistory;
import com.wipro.models.CargoStatus;
import com.wipro.models.Log;
import com.wipro.repositories.CargoHistoryRepository;
import com.wipro.repositories.CargoRepository;
import com.wipro.repositories.LogRepository;

import tr.com.yurticikargo.shippingorderdispatcherservices.CreateShipment;
import tr.com.yurticikargo.shippingorderdispatcherservices.CreateShipmentResponse;
import tr.com.yurticikargo.shippingorderdispatcherservices.ShippingOrderVO;
import tr.com.yurticikargo.sswıntegrationservices.ListInvDocumentInterfaceByReference;
import tr.com.yurticikargo.sswıntegrationservices.ListInvDocumentInterfaceByReferenceResponse;
import tr.com.yurticikargo.sswıntegrationservices.ShippingDataDetailVO;;


public class MainBusiness {
	
	@Autowired
    private CargoRepository cargoRepository;
	
	@Autowired
    private CargoHistoryRepository cargoHistoryRepository;
	  
	@Autowired
    private LogRepository logRepository;
	
	@Autowired
	private Environment env;

	public void CreateShipment(CreateShipment request) {
		
		Log log = new Log();		
	
		request = setPreCreateShipmentRequest(request);
		
		try {
			String createshipmentUrl = env.getProperty("webservice-client.createshipment");
			
			ObjectMapper mapperObj = new ObjectMapper();
			String requestString = mapperObj.writeValueAsString(request);			
			
			log.setUrl(createshipmentUrl);
			log.setRequest(requestString);
			log.setRequestDate(new Date());

			if(!IsCreateShipmentValidated(request)) {
				CreateLog(log);		
				return;
			}				
			
			ServiceAdapter serviceAdapter = new ServiceAdapter();
			CreateShipmentResponse response = serviceAdapter.createShipment(createshipmentUrl, request);
			
			String responseString = mapperObj.writeValueAsString(response);	
			log.setResponse(responseString);
			log.setResponseDate(new Date());
		} catch (Exception e) {
			
			log.setException(e.toString());
		}
		
		CreateLog(log);		
	}	
	
	public ListInvDocumentInterfaceByReferenceResponse QueryShipment(ListInvDocumentInterfaceByReference request) {		 			 
		
		Log log = new Log();
		
		ListInvDocumentInterfaceByReferenceResponse response = new ListInvDocumentInterfaceByReferenceResponse();
		try {
			
			String queryshipmentUrl = env.getProperty("webservice-client.queryshipment");
			 
			ObjectMapper mapperObj = new ObjectMapper();
			String requestString = mapperObj.writeValueAsString(request);			
			
			log.setUrl(queryshipmentUrl);
			log.setRequest(requestString);
			log.setRequestDate(new Date());
			
			if(!IsQueryShipmentValidated(request)) {
				CreateLog(log);		
				return response;
			}	
			
			ServiceAdapter serviceAdapter = new ServiceAdapter();
			response = serviceAdapter.queryShipment(queryshipmentUrl, request);		
			
			String responseString = mapperObj.writeValueAsString(response);	
			log.setResponse(responseString);
			log.setResponseDate(new Date());
			
			List<ShippingDataDetailVO> resultList = response.getShippingDataResponseVO().getShippingDataDetailVOArray();

			List<ShippingDataDetailVO> dagitimdaList = new ArrayList<ShippingDataDetailVO>();

			for (ShippingDataDetailVO shippingData : resultList) {

				if (IsCargoDelivered(shippingData)) {
					CreateCargo(shippingData, CargoStatus.Delivered);
				}
				else if (IsCargoCancel(shippingData)) {
					CreateCargo(shippingData, CargoStatus.Cancel);
				}
				else if (IsCargoDistribution(shippingData)) {				
					long cargoId = CreateCargo(shippingData, CargoStatus.Distribution);
					dagitimdaList.add(shippingData);
					CreateCargoHistory(shippingData, cargoId);
				}
			}		
			
		} catch (Exception e) {
			log.setException(e.toString());
		}	
		
		CreateLog(log);
		
		return response;
	}	
	
	private CreateShipment setPreCreateShipmentRequest(CreateShipment request) {
		String prefix = "TCELREFF";
		for (ShippingOrderVO shippingOrder : request.getShippingOrderVO()) {
			if(shippingOrder.getCargoKey().toUpperCase().contains(prefix) == false) {
				shippingOrder.setCargoKey(prefix + shippingOrder.getCargoKey());
			}
			if(shippingOrder.getInvoiceKey().toUpperCase().contains(prefix) == false) {
				shippingOrder.setInvoiceKey(prefix + shippingOrder.getInvoiceKey());
			}
		}
		return request;
	}
	
	private boolean IsCreateShipmentValidated(CreateShipment request) {
		
		if(request.getWsUserName().isEmpty())
			return false;
		if(request.getWsPassword().isEmpty())
			return false;
		
		return true;
	}
	
	private boolean IsQueryShipmentValidated(ListInvDocumentInterfaceByReference request) {
		
		if(request.getUserName().isEmpty())
			return false;
		if(request.getPassword().isEmpty())
			return false;
		return true;
	}

	private boolean IsCargoDistribution(ShippingDataDetailVO shippingData) {
		return shippingData.getCargoEventId().equals("OK") && shippingData.getRejectFlag().equals("");
	}	
	
	private boolean IsCargoCancel(ShippingDataDetailVO shippingData) {
		return shippingData.getCargoEventId().equals("OK") && shippingData.getRejectFlag().equals("1");
	}
	
	private boolean IsCargoDelivered(ShippingDataDetailVO shippingData) {
		return shippingData.getCargoEventId().equals("OK") && shippingData.getRejectFlag().equals("0");
	}
		
	private long CreateCargo(ShippingDataDetailVO shippingData, CargoStatus cargoStatus) {
		
		Cargo cargo = new Cargo();
		cargo.setCargoEventExplanation(shippingData.getCargoEventExplanation());
		cargo.setCargoEventId(shippingData.getCargoEventId());
		cargo.setRejectFlag(shippingData.getRejectFlag());
		cargoRepository.save(cargo);
		return cargo.getId();
	}
	
	private void CreateCargoHistory(ShippingDataDetailVO shippingData, long cargoId) {
		CargoHistory cargoHistory = new CargoHistory();
		cargoHistory.setCargoEventExplanation(shippingData.getCargoEventExplanation());
		cargoHistory.setCargoEventId(shippingData.getCargoEventId());
		cargoHistory.setRejectFlag(shippingData.getRejectFlag());
		cargoHistory.setCargoId(cargoId);
		cargoHistoryRepository.save(cargoHistory);
	}
	
	private void CreateLog(Log log) {
		
		logRepository.save(log);
	}
}

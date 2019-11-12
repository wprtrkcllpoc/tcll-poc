package com.wipro.turkcell;

import javax.xml.bind.JAXBElement;

import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import tr.com.yurticikargo.shippingorderdispatcherservices.CreateShipmentResponse;
import tr.com.yurticikargo.sswıntegrationservices.ListInvDocumentInterfaceByReferenceResponse;



public class ServiceAdapter extends WebServiceGatewaySupport {


	@SuppressWarnings("rawtypes")
	public CreateShipmentResponse createShipment (String url, Object request){
		
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("tr.com.yurticikargo.shippingorderdispatcherservices");
		ServiceAdapter client = new ServiceAdapter();
		client.setDefaultUri("");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		
		JAXBElement res = (JAXBElement)client.getWebServiceTemplate()	.marshalSendAndReceive(url, request);
		return (CreateShipmentResponse) res.getValue();	
	
	}
	
	@SuppressWarnings("rawtypes")
	public ListInvDocumentInterfaceByReferenceResponse queryShipment (String url, Object request){
		
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("tr.com.yurticikargo.sswıntegrationservices");
		ServiceAdapter client = new ServiceAdapter();
		client.setDefaultUri("");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		
		JAXBElement res = (JAXBElement)client.getWebServiceTemplate()	.marshalSendAndReceive(url, request);
		return (ListInvDocumentInterfaceByReferenceResponse) res.getValue();	
		
		
		

	}
	
	
	
}
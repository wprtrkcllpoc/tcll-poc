package com.wipro.turkcell;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tr.com.yurticikargo.shippingorderdispatcherservices.CreateShipment;
import tr.com.yurticikargo.sswıntegrationservices.ListInvDocumentInterfaceByReference;

@RestController
public class MainController {	

	@RequestMapping(value = "/CreateShipment", method = RequestMethod.POST,headers = "Accept=application/json")
	public void CreateShipment (@RequestBody CreateShipment request) {
		MainBusiness business = new MainBusiness();
		
		business.CreateShipment(request);
	}
	
	@RequestMapping(value = "/QueryShipment", method = RequestMethod.POST,headers = "Accept=application/json")
	public void QueryShipment (@RequestBody ListInvDocumentInterfaceByReference request) {		
				
		MainBusiness business = new MainBusiness();
		
		business.QueryShipment(request);
	}
}

package com.wipro.turkcell;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import tr.com.yurticikargo.sswıntegrationservices.CustParamsVO;
import tr.com.yurticikargo.sswıntegrationservices.ListInvDocumentInterfaceByReference;
import tr.com.yurticikargo.sswıntegrationservices.ListInvDocumentInterfaceByReferenceResponse;

@SpringBootTest
class WiproApplicationTests {

	@Test
	void contextLoads() {
	}
	
	public void whenNotFountQueryShipment_thenReturnFalse() {
	    // given
		ListInvDocumentInterfaceByReference request = new ListInvDocumentInterfaceByReference();
		request.setUserName("USER");
		request.setPassword("PASSWORD");
		request.setLanguage("TR");
		
		CustParamsVO custParamsVO = new CustParamsVO();
		List<String> invCustId = custParamsVO.getInvCustIdArray();
		invCustId.add("235993189");		
		request.setCustParamsVO(custParamsVO);		
		MainBusiness business = new MainBusiness();
		
	 
	    // when
		ListInvDocumentInterfaceByReferenceResponse response = business.QueryShipment(request);
	 
	    // then
	    assertEquals(response.getShippingDataResponseVO(), null);
	}

}

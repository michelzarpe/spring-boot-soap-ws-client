package com.zarpelon.spring.soap.api.clinet;

import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.zarpelon.spring.soap.api.loaneligibility.GetCountryRequest;
import com.zarpelon.spring.soap.api.loaneligibility.GetCountryResponse;

@Service
public class SoapClinet extends WebServiceGatewaySupport {

	public GetCountryResponse getCountry(GetCountryRequest request) {
		GetCountryResponse response = (GetCountryResponse) getWebServiceTemplate()
				.marshalSendAndReceive("http://localhost:8080/ws/countries", request);

		return response;
	}

}

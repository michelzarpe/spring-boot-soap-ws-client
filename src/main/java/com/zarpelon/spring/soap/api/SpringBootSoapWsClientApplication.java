package com.zarpelon.spring.soap.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zarpelon.spring.soap.api.clinet.SoapClinet;
import com.zarpelon.spring.soap.api.loaneligibility.GetCountryRequest;
import com.zarpelon.spring.soap.api.loaneligibility.GetCountryResponse;

@SpringBootApplication
@RestController
public class SpringBootSoapWsClientApplication {
	
	@Autowired
	public SoapClinet clinet;
		
	@PostMapping("/getCountry")
	public GetCountryResponse invokeSoapClinet(@RequestBody GetCountryRequest request) {
		return clinet.getCountry(request);
	}
	
	
	

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSoapWsClientApplication.class, args);
	}

}

package com.zarpelon.spring.soap.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.zarpelon.spring.soap.api.clinet.SoapClinet;

@Configuration
public class SoapConfig {
	
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
	    jaxb2Marshaller.setContextPath("com.zarpelon.spring.soap.api.loaneligibility");
		return jaxb2Marshaller;
	}
	
	@Bean
	@Primary
	public SoapClinet countryClient(Jaxb2Marshaller marshaller) {
		SoapClinet client = new SoapClinet();
		client.setDefaultUri("http://localhost:8080/ws");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
	

}

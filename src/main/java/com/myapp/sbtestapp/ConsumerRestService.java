package com.myapp.sbtestapp;

import org.springframework.web.client.RestTemplate;

public class ConsumerRestService {


	public static void main(String[] args) {
		
		 RestTemplate restTemplate = new RestTemplate();
	     MyDTO myDTO = restTemplate.getForObject("http://localhost:8080/test", MyDTO.class);
	     System.out.println(myDTO.getName());
		
		
	}

}

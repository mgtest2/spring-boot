package com.myapp;
import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.myapp.sbtestapp.MyDTO;


public class MyControllerIT {
	
    private static TestRestTemplate restTemplate;
	
	@BeforeClass
	public static void setup(){
		restTemplate = new TestRestTemplate();
		
	}
	
	 @Test
	 public void createClient() {
		 
		 RestTemplate restTemplate = new RestTemplate();
		 MyDTO myDTO = restTemplate.getForObject("http://localhost:8080/test", MyDTO.class);
		 System.out.println(myDTO.getName());
		 
		 assertEquals("set to dto", myDTO.getName());
		 assertEquals("from application prop", myDTO.getSpringProp());
		 
		 
	 }	
}

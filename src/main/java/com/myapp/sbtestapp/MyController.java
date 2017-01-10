package com.myapp.sbtestapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping("/test")
	public MyDTO testController(){
		
		MyDTO myDTO = new MyDTO();
		myDTO.setName("tes123");
		return myDTO;
	}
	
	
}

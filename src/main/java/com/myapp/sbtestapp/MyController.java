package com.myapp.sbtestapp;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@Resource(name="myDTO")
	private MyDTO myDTO;
	
	@RequestMapping("/test")
	public MyDTO testController(){
		
		myDTO.setName("set to dto");
		return myDTO;
	}
	
	
}

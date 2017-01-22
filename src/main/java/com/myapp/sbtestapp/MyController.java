package com.myapp.sbtestapp;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {


	@Resource(name="sbBean")
	private SBBean sbBean;
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public MyDTO testController(){
		MyDTO myDTO = new MyDTO();
		myDTO.setName("set to dto");
		myDTO.setSpringContext(sbBean.getName());
		myDTO.setExternalSprinProp(sbBean.getExternalSprinProp());
		myDTO.setSpringProp(sbBean.getSpringProp());
		return myDTO;
	}
	
	
}

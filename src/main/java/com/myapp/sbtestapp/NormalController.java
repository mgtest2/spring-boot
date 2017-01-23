package com.myapp.sbtestapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NormalController {

	@RequestMapping("/hello")
	public @ResponseBody String sayHello(){
		
		return "Hello World";
		
	}
}

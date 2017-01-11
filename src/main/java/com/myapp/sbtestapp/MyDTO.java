package com.myapp.sbtestapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myDTO")
public class MyDTO {

	@Value("${spring.application.prop}")
	private String springProp;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpringProp() {
		return springProp;
	}

	public void setSpringProp(String springProp) {
		this.springProp = springProp;
	}

}

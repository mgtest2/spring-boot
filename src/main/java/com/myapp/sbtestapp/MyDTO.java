package com.myapp.sbtestapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myDTO")
public class MyDTO {

	private String springProp;
	
	private String externalSprinProp;
	
	private String name;
	private String springContext;
	

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

	public String getSpringContext() {
		return springContext;
	}

	public void setSpringContext(String springContext) {
		this.springContext = springContext;
	}

	public String getExternalSprinProp() {
		return externalSprinProp;
	}

	public void setExternalSprinProp(String externalSprinProp) {
		this.externalSprinProp = externalSprinProp;
	}
	
	
	

}

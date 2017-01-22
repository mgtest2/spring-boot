package com.myapp.sbtestapp;

import org.springframework.beans.factory.annotation.Value;

public class SBBean {

	private String name;
	private String externalName;
	
	@Value("${spring.application.prop}")
	private String springProp;
	
	@Value("${spring.application.external.prop}")
	private String externalSprinProp;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExternalName() {
		return externalName;
	}

	public void setExternalName(String externalName) {
		this.externalName = externalName;
	}

	public String getSpringProp() {
		return springProp;
	}

	public void setSpringProp(String springProp) {
		this.springProp = springProp;
	}

	public String getExternalSprinProp() {
		return externalSprinProp;
	}

	public void setExternalSprinProp(String externalSprinProp) {
		this.externalSprinProp = externalSprinProp;
	}
	
	
	
	
}

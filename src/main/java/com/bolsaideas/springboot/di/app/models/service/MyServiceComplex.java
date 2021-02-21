package com.bolsaideas.springboot.di.app.models.service;




//@Component("myComplexService")
public class MyServiceComplex implements IService {

	@Override
	public String operation() {
		return "Running some important process COMPLEX...";
	}
	
	
}

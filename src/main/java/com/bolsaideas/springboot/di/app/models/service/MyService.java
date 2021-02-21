package com.bolsaideas.springboot.di.app.models.service;

import org.springframework.context.annotation.Primary;
@Primary
//@Component("mySimpleService")
public class MyService implements IService {

	@Override
	public String operation() {
		return "Running some important process SIMPLE...";
	}
	
	
}

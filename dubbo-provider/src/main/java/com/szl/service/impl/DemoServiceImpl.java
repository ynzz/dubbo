package com.szl.service.impl;

import com.szl.service.IDemoService;

public class DemoServiceImpl implements IDemoService{

	@Override
	public String sayHello(String name) {
		System.out.println("hello " + name);
		return "hello " + name;
	}

}

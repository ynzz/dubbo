package com.szl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.szl.service.IDemoService;

public class Consumer {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationConsumer.xml"});
		
		context.start();
		
		IDemoService demoService = (IDemoService)context.getBean("demoService");
		
		String message = demoService.sayHello("dubbo");
		
		System.out.println(message);
		
		context.close();
	}
}

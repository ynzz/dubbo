package com.szl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {

	public static void main(String[] args) {
		try {
			System.out.println("start...");
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationProvider.xml" });
			context.start();
			System.out.println("start end.");
		} catch (Exception e) {

		}
		
		synchronized(Provider.class){
			while(true){
				try {
					Provider.class.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

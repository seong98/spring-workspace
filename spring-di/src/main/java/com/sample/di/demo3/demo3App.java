package com.sample.di.demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class demo3App {
	
	public static void main(String[] args) {
		String resource = "classpath:/com/sample/di/demo3/demo3.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(resource);
		
		SampleController sample = ctx.getBean("controller", SampleController.class);
		
		sample.add("1", "2");
		
	}
}

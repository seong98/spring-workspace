package com.sample.di.demo8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo8App {

	public static void main(String[] args) {
		String resource = "classpath:/com/sample/di/demo8/"
				+ "demo8.xml";
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext(resource);
		
		LoginService service = ctx.getBean("loginService", LoginService.class);
		service.login("hong", "111111");
		
	}
}

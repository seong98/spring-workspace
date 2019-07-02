package com.sample.di.demo4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo4App {

	public static void main(String[] args) {
		String resource = "classpath:/com/sample/di/demo4/demo4.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(resource);
		
		EventNoticeService s1 = ctx.getBean("eventNoticeService", EventNoticeService.class);
		OrderService s2 = ctx.getBean("orderService", OrderService.class);
		
		s1.notice("홈페이지가 오픈했습니다. 사은품 받아가세요!");
		s2.sendOrderStatus();
	}
}

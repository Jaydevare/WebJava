package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Human hu = context.getBean("human",Human.class);
//		Human hu1 = context.getBean("human",Human.class);
		hu.pump();
		
//		boolean st = (hu == hu1);
//		System.out.println(st);
//		System.out.println(hu);
//		System.out.println(hu1);
	}

}



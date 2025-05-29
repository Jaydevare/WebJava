package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile
{
	public static void main(String[] args) 
	{
//		Vodafone vi =  new Vodafone();
//		vi.calling();
//		vi.data();
//		
//		Airtel ar =  new Airtel();
//		ar.calling();
//		ar.data();
//		
//		Sim si = new Vodafone();
//		si.calling();
//		si.data();
//		
//		Sim arr = new Airtel();
//		arr.calling();
//		arr.data();
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		Vodafone ar = (Vodafone) context.getBean("vi");
//		ar.calling();
//		ar.data();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Sim sim = context.getBean(Sim.class,"sim");
		sim.calling();
		sim.data();
	}

}

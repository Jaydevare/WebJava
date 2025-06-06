package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.utility.Coach;

public class App {
    public static void main(String[] args) {
        
    	//ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    	Coach coach = context.getBean("circketCoach", Coach.class);
    	System.out.println(coach.dailyWorkout());
    	System.out.println(coach.getFortuneService());
    }
}

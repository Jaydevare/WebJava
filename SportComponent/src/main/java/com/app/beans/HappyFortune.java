package com.app.beans;

import org.springframework.stereotype.Component;

import com.app.utility.FortuneService;
@Component
public class HappyFortune implements FortuneService{

	public HappyFortune() {
		System.out.println("in sad fortune def");
	}
	
	@Override
	public String getfortune() {
		// TODO Auto-generated method stub
		return "Happy Fortune";
	}
	
}

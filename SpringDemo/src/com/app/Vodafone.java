package com.app;

public class Vodafone implements Sim
{

	public Vodafone() {
		System.out.println("vi const");;
	}
	
	@Override
	public void calling() {
		System.out.println("Using VI for Calling");
		
	}

	@Override
	public void data() {
		System.out.println("Using VI for Data Browsing");
	}

}

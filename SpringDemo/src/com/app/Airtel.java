package com.app;

public class Airtel implements Sim
{
	
	public Airtel() {System.out.println("Const Airtel");}

	@Override
	public void calling() {
		System.out.println("Using Airtel for Calling");
		
	}

	@Override
	public void data() {
		System.out.println("Using Airtel for Data Browsing");
		
	}

}

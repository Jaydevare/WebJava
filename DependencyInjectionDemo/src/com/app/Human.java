package com.app;

public class Human 
{
	Heart heart;
	
	public Human()
	{
		System.out.println("In human const");
	}

	public Human(Heart heart) {
		super();
		this.heart = heart;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
	public void pump() 
	{
		if(heart!=null)
		{
			heart.pumping();
		}
		else
			System.out.println("You are Dead");
	}
}

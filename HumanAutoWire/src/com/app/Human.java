package com.app;



public class Human 
{
	Heart heart;
	
	public Human() {};
	
	
	
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

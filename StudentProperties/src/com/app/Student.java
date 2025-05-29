package com.app;

import org.springframework.beans.factory.annotation.Value;

public class Student 
{
	
	private String name;
	private String intresetedCourse;
	private String hobby;
	@Value("Jay")
	public void setName(String name) {
		this.name = name;
	}

	@Value("JAVA")
	public void setIntresetedCourse(String intresetedCourse) {
		this.intresetedCourse = intresetedCourse;
	}

	@Value("Cricket")
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", intresetedCourse=" + intresetedCourse + ", hobby=" + hobby + "]";
	}
	
	
}

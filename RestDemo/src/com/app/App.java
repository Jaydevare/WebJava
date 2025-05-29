package com.app;

import java.io.File;
import java.io.IOException;

import com.app.bean.Student;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App 
{
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException 
	{
		ObjectMapper objectMapper = new ObjectMapper();
		Student stud = objectMapper.readValue(new File("data/sample.json"), Student.class);
		System.out.println(stud.getRollNo());
		System.out.println(stud.getFirstName());
		System.out.println(stud.getLastName());
		System.out.println(stud.isActive());
		
		
		ObjectMapper objectMapper2 =  new ObjectMapper();
		Student stu = new Student();
		stu.setRollNo(02);
		stu.setFirstName("Jyotiee");
		stu.setLastName("Devare");
		stu.setActive(false);
		objectMapper2.writeValue(new File("data/sample.json"), stu);
	}
	
	

}

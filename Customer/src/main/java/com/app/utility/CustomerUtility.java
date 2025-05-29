package com.app.utility;

import java.util.ArrayList;
import java.util.List;

import com.app.bean.Customer;

public class CustomerUtility 
{
	public static List<Customer> getCustomers()
	{
		List<Customer> l = new ArrayList<Customer>();
		
		l.add(new Customer("Jay", "Devare", "digvijay@gmail.com", false));
		l.add(new Customer("Jyotie", "Jadhav", "jyotiee@gmail.com", true));
		l.add(new Customer("Mayur", "Javare", "mayur@gmail.com", false));
		l.add(new Customer("Sumedh", "Loharikar", "sumdeh@gmail.com", true));
		l.add(new Customer("Ayush", "Deshmukh", "ayush@gmail.com", true));
		
		return l;
	}
}

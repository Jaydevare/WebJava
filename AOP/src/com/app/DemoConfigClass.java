package com.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.app.dao.AccountDAO;
import com.app.dao.MembershipDOA;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"com.app"})
public class DemoConfigClass {

	@Bean
	public AccountDAO accountDAO()
	{
		return new AccountDAO();
	}
	
	@Bean
	public MembershipDOA membershipDOA()
	{
		return new MembershipDOA();
	}
}

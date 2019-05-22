package com.mahe.Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mahe.Service.CustomerLoginService;
import com.mahe.Service.CustomerLoginServiceImpl;
import com.mahe.configuration.SpringConfig;
import com.mahe.model.CustomerLogin;

public class Utility {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		CustomerLogin customerLogin = new CustomerLogin();
		customerLogin.setUsername("tom");
		customerLogin.setPassword("tom123");
		ApplicationContext ctx =new AnnotationConfigApplicationContext(SpringConfig.class);
		CustomerLoginService customerLoginService = (CustomerLoginService) ctx.getBean("customerLoginService");
		boolean isValid = customerLoginService.authenticateCustomerLogin(customerLogin);
		if(isValid) {
			System.out.println("Successfully Logged In...");
		}
		else {
			System.out.println("Invalid credentials");
		}

	}

}

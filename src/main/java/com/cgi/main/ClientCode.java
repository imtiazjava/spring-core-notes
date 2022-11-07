package com.cgi.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cgi.main.beans.Employee;
import com.cgi.main.beans.Greeting;

public class ClientCode {
	public static void main(String[] args) {

		//creating the ioc obj by using applicationcontext
		String configLocation="spring.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(configLocation);
		
		Employee e=context.getBean(Employee.class,"emp");
		System.out.println(e.toString());
	}

}

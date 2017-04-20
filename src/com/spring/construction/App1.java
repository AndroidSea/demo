package com.spring.construction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/construction/beans.xml");
		Employee emp=	(Employee) context.getBean("employee");
		System.out.println(emp.getAge()+emp.getName());
			
	}

}

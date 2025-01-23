package com.sprincore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
	
	ApplicationContext context=	new ClassPathXmlApplicationContext("com/sprincore/autowire/annotation/autoConfig.xml");
	
	emp e=context.getBean("emp1",emp.class); //dont have to typecast then
	System.out.println(e);
	
	}

}

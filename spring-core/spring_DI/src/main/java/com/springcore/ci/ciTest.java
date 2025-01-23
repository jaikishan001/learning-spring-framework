package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ciTest {

	public static void main(String[] args) {
	ApplicationContext	context=new ClassPathXmlApplicationContext("com/springcore/ci/ciConfig.xml");
	
	person p=(person)context.getBean("per1");
	certi c=(certi)context.getBean("certi1");
	System.out.println(p);
	System.out.println(c);
	
	addition add=(addition) context.getBean("add1");
	add.doSum();
	}

}

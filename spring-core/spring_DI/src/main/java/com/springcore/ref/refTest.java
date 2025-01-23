package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class refTest {

	public static void main(String[] args) {
		
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/ref/refConfig.xml");
		
		bClass temp=(bClass)context.getBean("bref");
		
		System.out.println(temp.getX());
		System.out.println("getting value from aClass.."+temp.getOb().getY()); //b ke object se int "y" ki value nikala h
		
		System.out.println(temp);
	}

}

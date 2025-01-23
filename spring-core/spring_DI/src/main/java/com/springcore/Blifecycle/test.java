package com.springcore.Blifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
	AbstractApplicationContext context=  new ClassPathXmlApplicationContext("com/springcore/Blifecycle/lifeConfig.xml");
	//we used here abstractapplication context so that we can use RegisterShutdowHook to show destroy method before shutting
	
	//registering shutdown hook
	context.registerShutdownHook();
	
	
	samosa s1=(samosa)context.getBean("sam1");
	System.out.println(s1);
	
	pepsi p1=context.getBean("p1",pepsi.class);
	System.out.println(p1);
	
	annoEx a=context.getBean("a1",annoEx.class);
	System.out.println(a);
	
	
	}

}

package com.springcore.collections;

import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {

		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/collections/collectionConfig.xml");
		
		emp emp1=(emp)context.getBean("emp1");
		System.out.println(emp1.getName());
		System.out.println(emp1.getAddresses());
		System.out.println(emp1.getCourses());
		System.out.println(emp1.getPhones());
		System.out.println(emp1.getProps());
		
	}

}

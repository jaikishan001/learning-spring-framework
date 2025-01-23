package com.springcore.stereotype.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cpm.springcore.standalone.collections.teacher;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/stereotype/annotation/stereoConfig.xml");
		
		Student st=con.getBean("ob",Student.class); //jab iska object banega to camelcase follow hoga same class name ka
		System.out.println(st);							//or we can use our name also e.g @component("ob")
		
		Student st2=con.getBean("ob",Student.class);
		
		System.out.println(st.getAddress().getClass().getName());
		

		
		System.out.println(st.hashCode());
		System.out.println(st2.hashCode()); //bean scope using annotation
		
		
		teacher t1=con.getBean("obej", teacher.class);
		teacher t2=con.getBean("obej",teacher.class);  //bean scope using xml
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
	}

}

package cpm.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class cTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("cpm/springcore/standalone/collections/collConfig.xml");
	
		person p1=context.getBean("per1", person.class);
		System.out.println(p1);
		System.out.println(p1.getProps());
		
		System.out.println("------------------------------------------------");
		
		person p2=context.getBean("per2", person.class);
		System.out.println(p2);
		
		System.out.println("------------------------------------------------");
		
		person f=context.getBean("f1", person.class); //f1 a;ag se bean banay h aur usme only map ki value h 
		System.out.println(f);
		
		System.out.println("------------------------------------------------");
		System.out.println(p1.getFriends().getClass().getName());
		System.out.println(p2.getFriends().getClass().getName()); //list ka type bhi bata dega jo hum set kiye honge
		System.out.println(f.getFeeStructure().getClass().getName());
	
	}

}

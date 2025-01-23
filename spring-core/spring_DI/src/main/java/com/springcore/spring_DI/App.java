package com.springcore.spring_DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //student class ko yaha se access karenge through config.xml we have to provide info.
        //this is our main method in app.java
        
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml"); //agar hamare pass ex xml h to aisa hi 
    
        student  student1=(student) context.getBean("student1");
        //benefit of this is we do not have to change in java application ..we have to made changes in xml file
        
        
        student student2=(student)context.getBean("student2");
        student student3=(student)context.getBean("student3");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}

package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
       ApplicationContext com=new ClassPathXmlApplicationContext("com/spring/orm/ormConfig.xml");
       
       HibernateTemplate tem = com.getBean("template" , HibernateTemplate.class);
       System.out.println(tem);
    }
}

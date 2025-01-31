package com.spring.p.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.p.jdbc.dao.teacherDao;
import com.spring.p.jdbc.entities.teacher;

public class pjdbcTest {

	
	//using java based configuration jdbc
	
	
	public static void main(String[] args) {

		ApplicationContext con = new AnnotationConfigApplicationContext(jdbcConfig.class);

		teacher th = new teacher();
		teacherDao d = con.getBean("teacherDao", teacherDao.class);

		
		
		// insert
		th.setTcity("dombivali");
		th.setTeacherId(256);
		th.setTname("sakhi");
		
		int result = d.insert(th);
		System.out.println("inserted " + result);
		
		System.out.println();

		
		
		// update
		th.setTname("supriya");
		th.setTeacherId(25);

		int result1 = d.change(th);
		System.out.println("updated " + result1);
		
		System.out.println();

		
		
		
		// delete
		teacher th1 = new teacher();
		
//		th1.setTeacherId(12);
		int re = d.gayab(12);

		System.out.println("deleted " + re);

		System.out.println();

		
		
		// select for a object
		th1.setTeacherId(25);
		teacher r = d.showTable(25);
		System.out.println("showing result .." + r);

		System.out.println();

		
		
		// select all
		List<teacher> teachers = d.showAll();  //return in form of list
		for (teacher t : teachers) {
			System.out.println(t);
		}

	}

}

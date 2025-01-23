package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.studentDao;
import com.spring.jdbc.entities.student;

public class jdbcTest {

	//using xml jdbc configuration
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("hello world");
	
	ApplicationContext con= new ClassPathXmlApplicationContext("com/spring/jdbc/jdbcConfig.xml");
//	JdbcTemplate template=con.getBean("jdbcTemplate",JdbcTemplate.class);	
	
	//-------basic -----insert query--not recommended
//	String query="insert into student value(?,?,?)";
//	
//	//fire query
//	int result=template.update(query,14,"param","miraroad");
//	System.out.println("number of recored is inserted ..."+result);
			
	
	
	
	/*first we created studentDao interface then to implement methods under it we created stdudentDaoImpl (insert())
	 * then int insert() method inside it and implemented it in studentDaoImpl also created jdbcTemplate class variable
	 * to fire querys
	 * then here we get bean of studentDao from xml file store it in stDao
	 * then set value under student
	 * the using that stDao bean we use insert() and passed the values
	 * and print results
	 * */
	
	studentDao stDao=con.getBean("studentDao",studentDao.class);
	
	student st= new student();
	
	
	//insert
	st.setCity("vasai");
	st.setId(103);
	st.setName("munna");
	
	
	int result=stDao.insert(st);
	System.out.println("student added... "+result);
			
	
	
	//update
	st.setName("param");
	st.setId(25);
	int r=stDao.change(st);
	System.out.println(r+" ..updated");
	
	
	//delete
	int re=stDao.deletes(101);
	System.out.println(re+"..deleted");
	
	
	
	System.out.println();

	
	//select
	student s=stDao.select(253);
	System.out.println(s);
	
	System.out.println();
	
	//select *
	List<student> students=stDao.showAll();
	for (student s1:students){
		System.out.println(s1);
	}
	
	
	}

}

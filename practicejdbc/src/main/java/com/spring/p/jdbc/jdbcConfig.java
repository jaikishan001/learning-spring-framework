package com.spring.p.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.p.jdbc.dao.teacherDao;
import com.spring.p.jdbc.dao.teacherDaoImpl;

@Configuration
@ComponentScan(basePackages = "com.spring.p.jdbc.dao")
public class jdbcConfig {

	
	@Bean("ds")
	public DataSource getdataSource() {
		
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("root@123");
		return ds;
	}
	
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate() {
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		
		jdbcTemplate.setDataSource(getdataSource());
		
		return jdbcTemplate;
	}
	
	
	//above used @autowired for below so no need to do this
	
//	@Bean("teacherDao")
//	public teacherDao getTeacheDao() {
//		
//		teacherDaoImpl td=new teacherDaoImpl();
//		td.setJdbcTemplate(getTemplate());
//		
//		return td;
//	}
			
	
}

package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.student;



public class studentDaoImpl implements studentDao{

	private JdbcTemplate jdbcTemplate;  //jdbctemplate class ka variable banya kyuki yaha se access kar sake

	
	//insert
	@Override
	public int insert(student stud1) {
		String query="insert into student values (?,?,?)";
		int r=this.jdbcTemplate.update(query, stud1.getId(),stud1.getName(),stud1.getCity() );
		
		return r;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	//updates
	@Override
	public int change(student stu1) {
		String query="update student set name=? where id=?";
		int r=this.jdbcTemplate.update(query, stu1.getName(), stu1.getId());
		return r;
	}

	
	//deletes
	@Override
	public int deletes(int St1) {
		String query="delete from student where id=?";
		int r=this.jdbcTemplate.update(query, St1);  //int type Id so st1 only
		return r;
	}

	
	//showing selected object
	@Override
	public student select(int  StudentId) {
		String query="select * from student where id=?";
		RowMapper <student> rowMapper =new rowMapperIml();  //created rowMapperImpl object here 
		student s=this.jdbcTemplate.queryForObject(query,rowMapper, StudentId);
		return s;
	}

	
	//showing all *
	@Override
	public List<student> showAll() {
		String query="select * from student";
		List<student> st=this.jdbcTemplate.query(query, new rowMapperIml());
		return st;
	}
	

	
	
	
	
}

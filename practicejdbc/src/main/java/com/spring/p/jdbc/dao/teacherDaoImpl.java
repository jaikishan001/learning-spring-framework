package com.spring.p.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.p.jdbc.entities.teacher;


@Component("teacherDao")
public class teacherDaoImpl implements teacherDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int insert(teacher t) {
		String query = "insert into student values(?,?,?)";
		int r = this.jdbcTemplate.update(query, t.getTeacherId(), t.getTname(), t.getTcity());
		
//for printing all
		String query1="select * from student";
		List<teacher> teachers=this.jdbcTemplate.query(query1, new rowMapperImpl());  //it will return list of object
		
//here printing results when inserted
		for (teacher t1 : teachers) {
			System.out.println(t1);
		}

		
		return r;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int change(teacher t) {
		String query = "update student set name=? where id=?";
		int r = this.jdbcTemplate.update(query, t.getTname(), t.getTeacherId()); //teacher class se get kia
		return r;
	}

	
	
	
	
	
	@Override
	public int gayab(int teacherId) {
		String query = "delete from student where id=?";
		int r = this.jdbcTemplate.update(query, teacherId);   //direct get kia teacher Id
		return r;
	}

	@Override
	public teacher showTable(int teacherId) {
		String query="select * from student where id=?";
		RowMapper<teacher> rowMapper=new rowMapperImpl();
		
		teacher t=this.jdbcTemplate.queryForObject(query, rowMapper, teacherId);
		return t;
	}

	@Override
	public List<teacher> showAll() {
	String query="select * from student";
	List<teacher> teachers=this.jdbcTemplate.query(query, new rowMapperImpl());  //it will return list of object
		return teachers;
	}

	

}

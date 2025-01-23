package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entities.student;

public interface studentDao {

	public int insert(student stud1);
	public int change(student stu1);
	public int deletes(int St1);
	public student select(int StudentId);
	public List<student> showAll();	
	
	
	
}

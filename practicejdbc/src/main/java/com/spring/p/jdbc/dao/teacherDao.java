package com.spring.p.jdbc.dao;

import java.util.List;

import com.spring.p.jdbc.entities.teacher;

public interface teacherDao {

	public int insert(teacher t);  //insert
	public int change(teacher t);	//Update
	public int gayab(int teacherId);	//delete
	public teacher showTable(int teacherId); //select
	public List<teacher> showAll();		//select *
}

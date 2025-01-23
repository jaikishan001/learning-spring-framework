package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.student;

public class rowMapperIml implements RowMapper<student>{

	@Override
	public student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		student st=new student();
		st.setId(rs.getInt(1));  //indexes
		st.setCity(rs.getString(3));  //resultSet rs is map values to the current row
		st.setName(rs.getString(2));
		
		return st;
	}
	

}

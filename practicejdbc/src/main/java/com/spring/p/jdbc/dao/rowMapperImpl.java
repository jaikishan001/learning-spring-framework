package com.spring.p.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.p.jdbc.entities.teacher;

public class rowMapperImpl implements RowMapper<teacher>{

	@Override
	public teacher mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		teacher th=new teacher();
		th.setTeacherId(rs.getInt(1)); //indexes 
		th.setTname(rs.getString(2)); //resultSet rs is map values to the current row
		th.setTcity(rs.getString(3));
		return th;
	}
	

}

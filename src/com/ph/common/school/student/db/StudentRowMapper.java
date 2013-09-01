package com.ph.common.school.student.db;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setId(rs.getInt("id"));
		student.setBizKeyNo(rs.getString("bizKeyNo"));
		student.setName(rs.getString("fristName"));
		student.setCity(rs.getString("city"));
		return student;

	}

}

package com.ph.common.school.student.db;

import java.util.List;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCTemplate implements StudentDAO {

	private JdbcTemplate jdbcTemplate;
	private DataSource dataSource;

	@Override
	public void setDataSource(DataSource ds) {
		// TODO Auto-generated method stub
		this.dataSource = ds;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void create(String name, Integer age) {
		// TODO Auto-generated method stub
		String sql = "insert into Student (name, age) values (?, ?)";

		jdbcTemplate.update(sql, name, age);

		return;

	}

	@Override
	public Student getStudent(Integer id) {
		// TODO Auto-generated method stub
		String sql = "SELECT ID, NAME, AGE FROM student where ID = ?";
		Student student = (Student) jdbcTemplate.queryForObject(sql,
				new Object[] { id }, new StudentRowMapper());

		return student;
	}

	@Override
	public List<Student> listStudents() {
		// TODO Auto-generated method stub
		String sql = "SELECT ID, NAME, AGE FROM student";
		List<Student> studentList = jdbcTemplate.query(sql,
				new StudentRowMapper());

		return studentList;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		String sql = "DELETE FROM student WHERE ID = ?";
		jdbcTemplate.update(sql, id);
		System.out.println("Deleted Record with ID = " + id);
		return;
	}

	@Override
	public void update(Integer id, Integer age) {
		// TODO Auto-generated method stub
		String sql = "update Student set age = ? where id = ?";
		jdbcTemplate.update(sql, age, id);
		System.out.println("Updated Record with ID = " + id);
		return;
	}

}

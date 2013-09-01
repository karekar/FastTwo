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
	public void create(String bizKeyNo, String name, String city) {
		// TODO Auto-generated method stub
		String sql = "insert into tb_ph_common_users (\"bizKeyNo\", \"fristName\", city) values (?, ?, ?)";

		jdbcTemplate.update(sql, bizKeyNo, name, city);

		return;

	}

	@Override
	public Student getStudent(Integer id) {
		// TODO Auto-generated method stub
		String sql = "SELECT id, \"bizKeyNo\", \"fristName\", city FROM tb_ph_common_users where ID = ?";
		Student student = (Student) jdbcTemplate.queryForObject(sql,
				new Object[] { id }, new StudentRowMapper());

		return student;
	}

	@Override
	public List<Student> listStudents() {
		// TODO Auto-generated method stub
		String sql = "SELECT id, \"bizKeyNo\", \"fristName\",, city FROM tb_ph_common_users";
		
		List<Student> studentList = jdbcTemplate.query(sql,
				new StudentRowMapper());

		return studentList;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		String sql = "DELETE FROM tb_ph_common_users WHERE id = ?";
		jdbcTemplate.update(sql, id);
		System.out.println("Deleted Record with ID = " + id);
		return;
	}

	@Override
	public void update(Integer id, Integer age) {
		// TODO Auto-generated method stub
		//String sql = "update Student set age = ? where id = ?";
		//jdbcTemplate.update(sql, age, id);
		System.out.println("Updated Record with id = EMPTY");
		return;
	}

}

/**
 * 
 */
package com.ph.common.school.student.db;

/**
 * @author pkarekar
 * 
 */
public class Student {

	private Integer id;

	private String name;

	private String city;
	
	private String bizKeyNo;

	public Student(){
		
		//Just to log
		System.out.println("DB Layer Jar Student Contructor.......");
		
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getBizKeyNo() {
		return bizKeyNo;
	}

	public void setBizKeyNo(String bizKeyNo) {
		this.bizKeyNo = bizKeyNo;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city
				+ ", bizKeyNo=" + bizKeyNo + "]";
	}

	
}
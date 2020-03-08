package com.mukit.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Student {
	
	@Id
	private Long _id;
	private String name;
	private String dept;
	
	public Long getId() {
		return _id;
	}
	public void setId(Long id) {
		_id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public Student() {
		
	}
	
	public Student(Long id, String name, String dept) {
		_id = id;
		this.name = name;
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "Student [Id=" + _id + ", name=" + name + ", dept=" + dept + "]";
	}
	
	
	
	
}

package com.mukit.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Student {
	
	@Id
	private Long Id;
	private String name;
	private String dept;
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
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
		Id = id;
		this.name = name;
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", dept=" + dept + "]";
	}
	
	
	
	
}

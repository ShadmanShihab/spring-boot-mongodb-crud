package com.mukit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mukit.model.Student;
import com.mukit.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	public boolean createStudent(Student student) {
		try {
			studentRepository.save(student);
			return false;
		}catch(IllegalArgumentException e) {
			return false;
		}
		
	}
	
	public List<Student> findAll(){
		return studentRepository.findAll();
	}
}

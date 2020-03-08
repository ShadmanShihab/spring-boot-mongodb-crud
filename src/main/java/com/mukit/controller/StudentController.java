package com.mukit.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mukit.model.Student;
import com.mukit.service.StudentService;

@RestController
@RequestMapping("students")
public class StudentController {
	@Autowired
	StudentService studentService;

	@PostMapping
	public void addStudent(@RequestBody Student student) {
		boolean result = studentService.createStudent(student);
		System.out.println(result);
	}

	@GetMapping
	public List<Student> findAll() {
		return studentService.findAll();
	}

	@GetMapping("/{id}")
	public Optional<Student> findById(@PathVariable("id") Long id) {
		System.out.println(id);
		return studentService.findById(id);
	}

	@PutMapping("/{id}")
	public void updateById(@PathVariable("id") Long id, @RequestBody Student student) {
		studentService.updateStudent(id, student);
	}

	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable("id") Long id) {
		studentService.deleteStudent(id);
	}

	@DeleteMapping
	public void deleteAll() {
		studentService.deleteAllStudent();
	}
}

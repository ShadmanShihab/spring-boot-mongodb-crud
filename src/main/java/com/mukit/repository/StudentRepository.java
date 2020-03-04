package com.mukit.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mukit.model.Student;

public interface StudentRepository extends MongoRepository<Student, Integer>{

}

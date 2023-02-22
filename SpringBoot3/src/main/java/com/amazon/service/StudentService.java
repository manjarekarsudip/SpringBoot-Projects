package com.amazon.service;

import java.util.List;

import com.amazon.entity.Student;

public interface StudentService {

	Student saveStudent(Student student);
	
	List<Student> getAllStudent();
	
	Student getStudentById(int id);

	int updateStudent(Student student);

	String deleteStudentById(int id);
}

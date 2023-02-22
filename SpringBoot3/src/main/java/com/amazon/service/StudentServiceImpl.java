package com.amazon.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.entity.Student;
import com.amazon.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student saveStudent(Student student) {
		Student savedStudent = studentRepository.save(student);
		return savedStudent;
	}

	@Override
	public List<Student> getAllStudent() {
		Iterable<Student> iterable = studentRepository.findAll();
		return (List<Student>) iterable;
	}

	@Override
	public Student getStudentById(int id) {
		Optional<Student> response = studentRepository.findById(id);
		return response.isPresent() ? response.get() : null;
	}

	@Override
	public int updateStudent(Student student) {
		Student response = studentRepository.save(student);
		int id = response.getId();
		return id;
	}

	@Override
	public String deleteStudentById(int id) {
		studentRepository.deleteById(id);
		return "Student Deleted";
	}

	
}

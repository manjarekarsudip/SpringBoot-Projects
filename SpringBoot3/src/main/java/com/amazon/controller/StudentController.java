package com.amazon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.entity.Student;
import com.amazon.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/save")
	public Student addStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}
	
	@GetMapping("/allStudents")
	public List<Student> getAllStuds(){
		return studentService.getAllStudent();
	}
	
	@GetMapping("/{id}")
	public Student getStudentById(@PathVariable int id) {
		Student student = studentService.getStudentById(id);
		return student;
	}
	
	@GetMapping("/request")
	public Student getStudById(@RequestParam int id) {
		Student student = studentService.getStudentById(id);
		return student;
	}
	
	@PutMapping("/update")
	public String updateStud(@RequestBody Student student) {
		int id = studentService.updateStudent(student);
		return String.format("Student is updated for id :: %d", id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteStud(@PathVariable int id) {
		String response = studentService.deleteStudentById(id);
		return response;
	}
}

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

import com.amazon.entity.Course;
import com.amazon.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@PostMapping("/save")
	public Course addCourse(@RequestBody Course course) {
		return courseService.saveCourse(course);
	}
	
	@GetMapping("/allCourse")
	public List<Course> getAllCourse(){
		return courseService.getAllCourse();
	}
	
	@GetMapping("/{id}")
	public Course getCourseById(@PathVariable int id) {
		Course course = courseService.getCourseById(id);
		return course;
	}
	
	@GetMapping("/request")
	public Course getById(@RequestParam int id) {
		Course course = courseService.getCourseById(id);
		return course;
	}
	
	@PutMapping("/update")
	public String updateCourse(@RequestBody Course course) {
		int id = courseService.updateCourse(course);
		return String.format("Course is updated for id :: %d", id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteCourse(@PathVariable int id) {
		String response = courseService.deleteCourseById(id);
		return response;
	}
}

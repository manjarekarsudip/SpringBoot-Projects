package com.amazon.service;

import java.util.List;

import com.amazon.entity.Course;

public interface CourseService {

	Course saveCourse(Course course);
	
	List<Course> getAllCourse();
	
	Course getCourseById(int id);

	int updateCourse(Course course);

	String deleteCourseById(int id);
}

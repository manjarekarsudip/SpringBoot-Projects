package com.amazon.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.entity.Course;
import com.amazon.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepository;
	@Override
	public Course saveCourse(Course course) {
		Course savedCourse = courseRepository.save(course);
		return savedCourse;
	}

	@Override
	public List<Course> getAllCourse() {
		Iterable<Course> iterable = courseRepository.findAll();
		return (List<Course>) iterable;
	}

	@Override
	public Course getCourseById(int id) {
		Optional<Course> response = courseRepository.findById(id);
		return response.isPresent() ? response.get() : null;
	}

	@Override
	public int updateCourse(Course course) {
		Course response = courseRepository.save(course);
		int id = response.getId();
		return id;
	}

	@Override
	public String deleteCourseById(int id) {
		courseRepository.deleteById(id);
		return "Course Deleted";
	}

}

package com.amazon.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.amazon.entity.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, Integer>{

}

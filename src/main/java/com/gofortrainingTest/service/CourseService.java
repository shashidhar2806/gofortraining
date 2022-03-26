package com.gofortrainingTest.service;

import java.util.List;
import java.util.Optional;

import com.gofortrainingTest.model.Course;


public interface CourseService {

	public Course saveCourse(Course course);
	
	public List<Course> courseList();
	
	public Optional<Course> getCourseById(int id);
}

package com.gofortrainingTest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gofortrainingTest.model.Course;
import com.gofortrainingTest.service.CourseService;


@CrossOrigin("*")
@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;

	@PostMapping(value = "/saveCourse")
	public Course saveCourse(@RequestBody Course course) {
		try {
			return courseService.saveCourse(course);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@GetMapping(value = "/courseList")
	public List<Course> courseList(){
		try {
			return courseService.courseList();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@GetMapping(value = "/courseDetail/{id}")
	public Optional<Course> courseDetail(@PathVariable String id){
		try {
			int courseId = Integer.parseInt(id);
			return courseService.getCourseById(courseId);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}

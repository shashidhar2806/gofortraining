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

import com.gofortrainingTest.model.EnrollCourse;
import com.gofortrainingTest.service.EnrollCourseService;


@CrossOrigin("*")
@RestController
public class EnrollCourseController {
	
	@Autowired
	private EnrollCourseService enrollCourseService;

	@PostMapping(value = "/saveEnrollCourse")
	public EnrollCourse saveEnrollCourse(@RequestBody EnrollCourse enrollCourse) {
		try {
			return enrollCourseService.saveEnrollCourse(enrollCourse);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@GetMapping(value = "/enrollCourseList")
	public List<EnrollCourse> enrollCourseList(){
		try {
			return enrollCourseService.enrollCourseList();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@GetMapping(value = "/enrollCourse/{id}")
	public Optional<EnrollCourse> findCourseById(@PathVariable int id) {
		try {
			return enrollCourseService.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}

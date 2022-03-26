package com.gofortrainingTest.service;

import java.util.List;
import java.util.Optional;

import com.gofortrainingTest.model.EnrollCourse;


public interface EnrollCourseService {
	
	public EnrollCourse saveEnrollCourse(EnrollCourse enrollCourse);
	
	public List<EnrollCourse> enrollCourseList();

	public Optional<EnrollCourse> findById(int id);

}

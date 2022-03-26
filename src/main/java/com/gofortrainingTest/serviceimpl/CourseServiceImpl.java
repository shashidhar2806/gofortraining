package com.gofortrainingTest.serviceimpl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gofortrainingTest.model.Course;
import com.gofortrainingTest.repository.CourseRepository;
import com.gofortrainingTest.service.CourseService;

@Service
@Transactional
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	public Course saveCourse(Course course) {
		try {
			return courseRepository.save(course);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Course> courseList() {
		try {
			return courseRepository.findAll();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Optional<Course> getCourseById(int id) {
		try {
			return courseRepository.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	

}

package com.gofortrainingTest.serviceimpl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gofortrainingTest.model.EnrollCourse;
import com.gofortrainingTest.repository.EnrollCourseRepository;
import com.gofortrainingTest.service.EnrollCourseService;


@Service
@Transactional
public class EnrollCourseServiceImpl implements EnrollCourseService {
	
	@Autowired
	private EnrollCourseRepository enrollCourseRepository;

	@Override
	public EnrollCourse saveEnrollCourse(EnrollCourse enrollCourse) {
		try {
			return enrollCourseRepository.save(enrollCourse);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<EnrollCourse> enrollCourseList() {
		try {
		  return enrollCourseRepository.findAll();
		} catch (Exception e) {
			e.printStackTrace();			
			return null;
		}
	}

	@Override
	public Optional<EnrollCourse> findById(int id) {
		try {
			return enrollCourseRepository.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	
	
	
}

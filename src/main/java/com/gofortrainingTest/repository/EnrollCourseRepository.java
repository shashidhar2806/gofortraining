package com.gofortrainingTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gofortrainingTest.model.EnrollCourse;


@Repository
public interface EnrollCourseRepository extends JpaRepository<EnrollCourse, Integer>{

}

package com.gofortrainingTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gofortrainingTest.model.Student;


public interface StudentRepository extends JpaRepository<Student, Long> {

}

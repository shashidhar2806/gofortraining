package com.gofortrainingTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gofortrainingTest.model.Employer;


@Repository
public interface EmployerRepository extends JpaRepository<Employer, Integer> {

}

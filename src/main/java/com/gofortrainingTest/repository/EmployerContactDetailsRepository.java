package com.gofortrainingTest.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gofortrainingTest.model.Employer;
import com.gofortrainingTest.model.EmployerContactDetails;


@Repository
public interface EmployerContactDetailsRepository extends JpaRepository<EmployerContactDetails, Integer> {
	
	
	
	List<EmployerContactDetails> findAllByEmployerId(Optional<Employer> employerId);

	
}

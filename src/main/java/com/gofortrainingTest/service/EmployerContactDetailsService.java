package com.gofortrainingTest.service;

import java.util.List;
import java.util.Optional;

import com.gofortrainingTest.model.Employer;
import com.gofortrainingTest.model.EmployerContactDetails;


public interface EmployerContactDetailsService {
	
	public EmployerContactDetails saveEmployerContactDetails(EmployerContactDetails employerContactDetails);
	
	public List<EmployerContactDetails> employerContactDetailsList();

	public List<EmployerContactDetails> getEmpContDetByEmployer(Optional<Employer> employer);

}

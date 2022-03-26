package com.gofortrainingTest.service;

import java.util.List;

import com.gofortrainingTest.model.Employer;


public interface EmployerService {
	
	public Employer saveEmployer(Employer employer);
	
	public List<Employer> employerList();

}

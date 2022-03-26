package com.gofortrainingTest.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gofortrainingTest.model.Employer;
import com.gofortrainingTest.repository.EmployerRepository;
import com.gofortrainingTest.service.EmployerService;


@Service
@Transactional
public class EmployerServiceImpl implements EmployerService{
	
	@Autowired
	private EmployerRepository employerRepository;

	@Override
	public Employer saveEmployer(Employer employer) {
		try {
			return employerRepository.save(employer);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Employer> employerList() {
		try {
			return employerRepository.findAll();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	

}

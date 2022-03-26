package com.gofortrainingTest.serviceimpl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gofortrainingTest.model.Employer;
import com.gofortrainingTest.model.EmployerContactDetails;
import com.gofortrainingTest.repository.EmployerContactDetailsRepository;
import com.gofortrainingTest.service.EmployerContactDetailsService;



@Service
@Transactional
public class EmployerContactDetailsServicImpl implements EmployerContactDetailsService {
	
	@Autowired
	private EmployerContactDetailsRepository employerContactDetailsRepo;

	@Override
	public EmployerContactDetails saveEmployerContactDetails(EmployerContactDetails employerContactDetails) {
		try {
			return employerContactDetailsRepo.save(employerContactDetails);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<EmployerContactDetails> employerContactDetailsList() {
		try {
			return employerContactDetailsRepo.findAll();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<EmployerContactDetails> getEmpContDetByEmployer(Optional<Employer> employerId) {
		try {
			return employerContactDetailsRepo.findAllByEmployerId(employerId);
		} catch (Exception e) {
			e.printStackTrace();			
			return null;
		}
	}

	
}

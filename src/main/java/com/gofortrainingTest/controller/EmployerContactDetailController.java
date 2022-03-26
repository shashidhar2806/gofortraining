package com.gofortrainingTest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gofortrainingTest.model.Employer;
import com.gofortrainingTest.model.EmployerContactDetails;
import com.gofortrainingTest.repository.EmployerRepository;
import com.gofortrainingTest.service.EmployerContactDetailsService;



@CrossOrigin("*")
@RestController
public class EmployerContactDetailController {
	
	@Autowired
	private EmployerContactDetailsService employerContactDetailsService;
	
	@Autowired
	private EmployerRepository employerRepo;
	
	@GetMapping(value = "/employerContactDetailsList")
	public List<EmployerContactDetails> employerContactDetailsList(){
		try {
			return employerContactDetailsService.employerContactDetailsList();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@PostMapping(value = "/saveEmployerContactDetails")
	public EmployerContactDetails saveEmployerContactDetails(@RequestBody EmployerContactDetails employerContactDetails) {
		try {
			return employerContactDetailsService.saveEmployerContactDetails(employerContactDetails);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@GetMapping(value = "/getEmployerContactDetailsByEmployer/{empId}")
	public List<EmployerContactDetails> getEmployerContactDetailsByEmployer(@PathVariable String empId){
		try {
			int id = Integer.parseInt(empId);
			Optional<Employer> employer = employerRepo.findById(id);
			return employerContactDetailsService.getEmpContDetByEmployer(employer);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}

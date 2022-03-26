package com.gofortrainingTest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gofortrainingTest.model.Employer;
import com.gofortrainingTest.service.EmployerService;


@CrossOrigin("*")
@RestController
public class EmployerController {
	
	@Autowired
	private EmployerService employerService;
	
	@PostMapping("/saveEmployer")
	public Employer saveEmployer(@RequestBody Employer empolyer) {
		try {
			return employerService.saveEmployer(empolyer);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@GetMapping("/employerList")
	public List<Employer> employerList(){
		try {
			return employerService.employerList();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}

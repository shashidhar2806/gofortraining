package com.gofortrainingTest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gofortrainingTest.model.ContactForm;
import com.gofortrainingTest.service.ContactFormService;



@CrossOrigin("*")
@RestController
public class contactFormController {
	
	@Autowired
	private ContactFormService contactFormService;
	
	@PostMapping(value = "/saveContactForm")
	public ContactForm saveContactForm(@RequestBody ContactForm contactForm) {
		try {
			return contactFormService.saveContactForm(contactForm);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@GetMapping(value = "/contactFormList")
	public List<ContactForm> contactFormList(){
		try {
			return contactFormService.contactFormList();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}

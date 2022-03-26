package com.gofortrainingTest.service;

import java.util.List;

import com.gofortrainingTest.model.ContactForm;


public interface ContactFormService {
	
	public ContactForm saveContactForm(ContactForm contactForm);
	
	public List<ContactForm> contactFormList();

}

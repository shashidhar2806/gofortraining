package com.gofortrainingTest.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gofortrainingTest.model.ContactForm;
import com.gofortrainingTest.repository.ContactFormRepository;
import com.gofortrainingTest.service.ContactFormService;


@Service
@Transactional
public class ContactFormServiceImpl implements ContactFormService {
	
	@Autowired
	private ContactFormRepository contactFormRepository;

	@Override
	public ContactForm saveContactForm(ContactForm contactForm) {
		try {
			return contactFormRepository.save(contactForm);
		} catch (Exception e) {
			e.printStackTrace();			
			return null;
		}
	}

	@Override
	public List<ContactForm> contactFormList() {
		try {
			return contactFormRepository.findAll();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	
	
}

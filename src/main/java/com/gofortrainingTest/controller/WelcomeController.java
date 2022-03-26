package com.gofortrainingTest.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class WelcomeController {
	
	@GetMapping(value = "/")
	public String welcome() {
		return "Welcome to Go For Training...";
	}

}

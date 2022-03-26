package com.gofortrainingTest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class TestController {
	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String test() {
		return "Welcom...";
	}

}

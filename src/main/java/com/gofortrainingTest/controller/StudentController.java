package com.gofortrainingTest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gofortrainingTest.model.Student;
import com.gofortrainingTest.repository.StudentRepository;



@CrossOrigin("*")
@RestController
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping(value = "/studentList")
	public List<Student> studentList(){
		return studentRepository.findAll();
	}
	
	@PostMapping(value = "/saveStudent")
	public Student saveStudent(@RequestBody Student student) {
		return studentRepository.save(student);
	}

}

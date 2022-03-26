package com.gofortrainingTest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gofortrainingTest.model.ScheduleDemoOrTraining;
import com.gofortrainingTest.service.ScheduleDemoOrTrainingService;


@CrossOrigin("*")
@RestController
public class ScheduleDemoOrTrainingController {

	@Autowired
	private ScheduleDemoOrTrainingService scheduleDemoOrTrainingService;
	
	@PostMapping(value = "/saveScheduleDemoOrTraining")
	public ScheduleDemoOrTraining saveScheduleDemoOrTraining(@RequestBody ScheduleDemoOrTraining scheduleDemoOrTraining) {
		try {
			return scheduleDemoOrTrainingService.saveScheduleDemoOrTraining(scheduleDemoOrTraining);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@GetMapping("/scheduleDemoOrTrainingList")
	public List<ScheduleDemoOrTraining> scheduleDemoOrTrainingList(){
		try {
			return scheduleDemoOrTrainingService.scheduleDemoOrTrainingList();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}

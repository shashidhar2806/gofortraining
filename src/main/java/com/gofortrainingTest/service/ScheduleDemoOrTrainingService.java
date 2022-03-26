package com.gofortrainingTest.service;

import java.util.List;

import com.gofortrainingTest.model.ScheduleDemoOrTraining;


public interface ScheduleDemoOrTrainingService {

	public ScheduleDemoOrTraining saveScheduleDemoOrTraining(ScheduleDemoOrTraining scheduleDemoOrTraining);
	
	public List<ScheduleDemoOrTraining> scheduleDemoOrTrainingList();
}

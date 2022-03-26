package com.gofortrainingTest.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gofortrainingTest.model.ScheduleDemoOrTraining;
import com.gofortrainingTest.repository.ScheduleDemoOrTrainingRepository;
import com.gofortrainingTest.service.ScheduleDemoOrTrainingService;


@Service
@Transactional
public class ScheduleDemoOrTrainingServiceImpl implements ScheduleDemoOrTrainingService {
	
	@Autowired
	private ScheduleDemoOrTrainingRepository scheduleDemoOrTrainingRepo;

	@Override
	public ScheduleDemoOrTraining saveScheduleDemoOrTraining(ScheduleDemoOrTraining scheduleDemoOrTraining) {
		try {
			return scheduleDemoOrTrainingRepo.save(scheduleDemoOrTraining);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<ScheduleDemoOrTraining> scheduleDemoOrTrainingList() {
		try {
			return scheduleDemoOrTrainingRepo.findAll();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}

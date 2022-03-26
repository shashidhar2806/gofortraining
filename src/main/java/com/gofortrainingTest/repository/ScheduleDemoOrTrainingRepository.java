package com.gofortrainingTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gofortrainingTest.model.ScheduleDemoOrTraining;


@Repository
public interface ScheduleDemoOrTrainingRepository extends JpaRepository<ScheduleDemoOrTraining, Integer> {

}

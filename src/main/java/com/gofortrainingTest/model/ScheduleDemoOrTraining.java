package com.gofortrainingTest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ScheduleDemoOrTraining {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private int role;
	
	private String title;
	
	private String trainer;
	
	private String demoDate;
	
	private String startDate;
	
	private int bridgeNum;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	public String getDemoDate() {
		return demoDate;
	}

	public void setDemoDate(String demoDate) {
		this.demoDate = demoDate;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public int getBridgeNum() {
		return bridgeNum;
	}

	public void setBridgeNum(int bridgeNum) {
		this.bridgeNum = bridgeNum;
	}

}

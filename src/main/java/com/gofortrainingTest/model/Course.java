package com.gofortrainingTest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String courseName;
	
	private String courseTitle;
	
	private int courseType;
	
	private String courseBanner;
	
	private float offeredPrice;
	
	private float actualPrice;
	
	private int courseCategory;
	
	private int duration;
	
	private String skillLevel;

	@Column(length = 255)
	private String courseContent;
	
	private String courseIcon;
	
	private String[] prerequisite;
	
	private String overview;
	
	private String metaTile;
	
	private String metaDescription;
		
	private String canonical;
	
	private String coueseContentPDF;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public int getCourseType() {
		return courseType;
	}

	public void setCourseType(int courseType) {
		this.courseType = courseType;
	}

	public String getCourseBanner() {
		return courseBanner;
	}

	public void setCourseBanner(String courseBanner) {
		this.courseBanner = courseBanner;
	}

	public float getOfferedPrice() {
		return offeredPrice;
	}

	public void setOfferedPrice(float offeredPrice) {
		this.offeredPrice = offeredPrice;
	}

	public float getActualPrice() {
		return actualPrice;
	}

	public void setActualPrice(float actualPrice) {
		this.actualPrice = actualPrice;
	}

	public int getCourseCategory() {
		return courseCategory;
	}

	public void setCourseCategory(int courseCategory) {
		this.courseCategory = courseCategory;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getSkillLevel() {
		return skillLevel;
	}

	public void setSkillLevel(String skillLevel) {
		this.skillLevel = skillLevel;
	}

	public String getCourseContent() {
		return courseContent;
	}

	public void setCourseContent(String courseContent) {
		this.courseContent = courseContent;
	}

	public String getCourseIcon() {
		return courseIcon;
	}

	public void setCourseIcon(String courseIcon) {
		this.courseIcon = courseIcon;
	}

	public String[] getPrerequisite() {
		return prerequisite;
	}

	public void setPrerequisite(String[] prerequisite) {
		this.prerequisite = prerequisite;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public String getMetaTile() {
		return metaTile;
	}

	public void setMetaTile(String metaTile) {
		this.metaTile = metaTile;
	}

	public String getMetaDescription() {
		return metaDescription;
	}

	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}

	public String getCanonical() {
		return canonical;
	}

	public void setCanonical(String canonical) {
		this.canonical = canonical;
	}

	public String getCoueseContentPDF() {
		return coueseContentPDF;
	}

	public void setCoueseContentPDF(String coueseContentPDF) {
		this.coueseContentPDF = coueseContentPDF;
	}
	
	
	
}

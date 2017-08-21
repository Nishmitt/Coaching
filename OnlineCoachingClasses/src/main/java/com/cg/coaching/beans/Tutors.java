package com.cg.coaching.beans;

import javax.persistence.Entity;

@Entity
public class Tutors {
	private int id, experienceInYears;
	private String name, qualification;
	public Tutors(int id, int experienceInYears, String name, String qualification) {
		super();
		this.id = id;
		this.experienceInYears = experienceInYears;
		this.name = name;
		this.qualification = qualification;
	}
	public Tutors() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getExperienceInYears() {
		return experienceInYears;
	}
	public void setExperienceInYears(int experienceInYears) {
		this.experienceInYears = experienceInYears;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	} 
	
	
	

}

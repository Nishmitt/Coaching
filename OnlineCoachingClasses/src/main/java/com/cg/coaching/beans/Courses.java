package com.cg.coaching.beans;

import javax.persistence.Entity;

@Entity
public class Courses {
	private int courseCode;
	private String courseName, description;
	private float courseFee;
	public Courses(int courseCode, String courseName, String description, float courseFee) {
		super();
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.description = description;
		this.courseFee = courseFee;
	}
	public Courses() {
		super();
	}
	public int getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(int courseCode) {
		this.courseCode = courseCode;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(float courseFee) {
		this.courseFee = courseFee;
	}
	
	

}

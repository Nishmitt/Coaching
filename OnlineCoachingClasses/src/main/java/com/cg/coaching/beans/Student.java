package com.cg.coaching.beans;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private String studID;
	private String name;
	private String email,dob,password;
	@Embedded
	private Address address;
	
	
	public Student(String studID, String name, String email, String dob, String password, Address address) {
		super();
		this.studID = studID;
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.password = password;
		this.address = address;
	}
	public String getStudID() {
		return studID;
	}
	public void setStudID(String studID) {
		this.studID = studID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Student() {
		super();
	}
	
}

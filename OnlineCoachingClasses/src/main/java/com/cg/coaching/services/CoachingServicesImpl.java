package com.cg.coaching.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.coaching.beans.Student;
import com.cg.coaching.dao.CoachingDaoServices;
@Service
@Transactional
public class CoachingServicesImpl implements CoachingServices{
@Autowired
CoachingDaoServices dao;

	public Student acceptStudentDetails(Student student) {
		
		return dao.registerStudent(student);
	}

}

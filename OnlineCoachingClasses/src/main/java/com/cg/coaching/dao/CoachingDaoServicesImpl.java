package com.cg.coaching.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.coaching.beans.Student;

@Repository
public class CoachingDaoServicesImpl implements CoachingDaoServices{
@PersistenceContext
EntityManager em;

public Student registerStudent(Student student) {
	// TODO Auto-generated method stub
	return null;
}


	

}

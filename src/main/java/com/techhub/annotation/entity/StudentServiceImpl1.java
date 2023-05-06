package com.techhub.annotation.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("stud2")
@Transactional
public class StudentServiceImpl1 implements StudentServices{
@Autowired
StudentDao sDao;
	@Override
	public int addStudent(Student obj) {
		return sDao.addStudent(obj);
	}

	@Override
	public Student updateStudent(Student obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudent(int studentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteStudent(int studentId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void display() {
System.out.println("Inside ServiceImpl1 Stud2");		
	}

}

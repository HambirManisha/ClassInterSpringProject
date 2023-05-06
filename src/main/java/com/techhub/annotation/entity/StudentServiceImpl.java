package com.techhub.annotation.entity;

import org.springframework.stereotype.Service;

@Service("stud1")
public class StudentServiceImpl implements StudentServices {

	@Override
	public int addStudent(Student obj) {
		// TODO Auto-generated method stub
		return 0;
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
System.out.println("Student data!!!!");		
System.out.println("Inside ServiceImpl Stud1");
	}

}

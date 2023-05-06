package com.techhub.annotation.entity;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//@Service
@Repository

public class StudentDaoImpl implements StudentDao {
	@Autowired
	SessionFactory sf;

	@Override
	public int addStudent(Student obj) {

		try {
			Session s = sf.getCurrentSession();
			s.merge(obj);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public Student updateStudent(Student obj) {
		// TODO Auto-generated method stub
		return null;
	}

	//@Autowired
//	SessionFactory factory;
	@Override
	public Student getStudent(int studentId) {
		Session s = sf.getCurrentSession();
		Transaction tx=null;
		Student student=null;
		try {
			//Session s = sf.getCurrentSession();
			s.beginTransaction();
			student =s.get(Student.class, studentId);
			//s.merge(studentId);
			tx.commit();
			//return getStudent(2);
		} catch (Exception e) {
			e.printStackTrace();
					}
		return student;
	}


	@Override
//@Autowired
	public int deleteStudent(int studentId) {
		/*try {
			Session s = sf.getCurrentSession();
			System.out.println("delete the student");

			s.delete(s);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		return 0;
	}

	@Override
	public void display() {
		System.out.println("Spring with hibernate configuration ");
	}

}

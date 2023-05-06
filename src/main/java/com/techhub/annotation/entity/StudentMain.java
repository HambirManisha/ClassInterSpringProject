package com.techhub.annotation.entity;

import java.util.List;

import com.google.protobuf.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@ComponentScan
@Configuration
public class StudentMain {
	//@Autowired
	//static StudentServiceImpl service;

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(StudentMain.class);
		//StudentServices ss = context.getBean(StudentServices.class);
		//StudentDao sdao = context.getBean(StudentDao.class);
		//ss.display();
		//sdao.display();
		// service.display();//showing nullpointerException
		A a = context.getBean(A.class);
		a.display();
		
		
	}
}

@Component
class A {
	@Autowired
	@Qualifier("stud2") // ask here

	StudentServices service;

	void display() {
		
		System.out.println("dispaly service in class A!!");
		Student s1=new Student(1, "ASSSS");
		//Student s2=new Student(2, "DD");
		//Student s3=new Student(3, "EE");
		//Student s4=new Student(4,"BB");
		service.addStudent(s1);
		
		}

}

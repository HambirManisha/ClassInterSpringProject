package com.java.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		College clg=(College) context.getBean("college");
		System.out.println("College====>" +clg);
		
	}

}

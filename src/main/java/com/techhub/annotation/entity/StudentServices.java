package com.techhub.annotation.entity;

public interface StudentServices {
int addStudent(Student obj);
Student updateStudent(Student obj);
Student getStudent(int studentId);
int deleteStudent(int studentId);
void display();
}

package com.java;

import java.util.HashMap;

public class Test {
public static void main(String[] args) {
	 String s=new String("Hello world!!");
	 System.out.println(0.1*3==0.3);
	 System.out.println(0.1*2==0.2);
	m1();
	method(null);
	
	s1();
}

  static void s1() {
	HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
	hm.put(null, null);
  }

public static void method(Object o) {
System.out.println("Object method");	
}
 public static void method(String s) {
	 System.out.println("String method");
 }

static void m1() {
	Integer num1=100;
	Integer num2=100;
	
	if(num1==num2) {
		System.out.println("num1==num2");
	}else {
		System.out.println("num1!==num2");
	}
	
}
}

package com.atguigu.java;

public class Student extends Person {

	String major;

	public Student() {
	}

	public Student(String major) {
		this.major = major;
	}

	@Override
	public void eat() {
		System.out.println("学生要吃有营养的食物.......");
	}

}

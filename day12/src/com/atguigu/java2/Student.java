package com.atguigu.java2;

public class Student extends Person{
	
	String major;
	int id = 1002;
	
	public Student() {
		
	}
	
	public Student(String major) {
		this.major = major;
	}
	
	@Override
	public void eat() {
		super.eat();
		System.out.println("学生:吃饭");
	}
	
	public void study() {
		System.out.println("学生：学习");
	}
	
	public void show() {
		System.out.println("name=" + super.name + ",age=" + age);
		System.out.println("id=" + id);
		System.out.println("id=" + super.id);
	}
}

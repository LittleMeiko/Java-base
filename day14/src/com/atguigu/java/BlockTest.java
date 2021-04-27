package com.atguigu.java;

public class BlockTest {
	
	public static void main(String[] args) {
		Student student = new Student();
	}
}

class Person {

	private String name;
	private int age;

	public Person() {
		System.out.println("父类的构造方法");
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	static {
		System.out.println("父类的静态代码块");
	}

	{
		System.out.println("父类的非静态代码块");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void eat() {
		System.out.println("eating....");
	}
}

class Student extends Person {
	private int studentNumber;
	
	public Student() {
		System.out.println("子类的构造方法");
	}
	
	static {
		System.out.println("子类的静态代码块");
	}
	
	{
		System.out.println("子类的非静态代码块");
	}
	
	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
}


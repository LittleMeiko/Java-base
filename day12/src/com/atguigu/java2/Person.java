package com.atguigu.java2;

public class Person {
	String name;
	int age;
	int id = 1001;
	
	public Person() {
		
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person(String name,int age) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println("人：吃饭");
	}
	
	public void sleep() {
		System.out.println("人：睡觉");
	}
	
}
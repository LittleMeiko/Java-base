package com.atguigu.java;

public class Person {
	
	String name;
	int age;
	
	public Person() {
		
	}
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age; 
	}
	
	public void eat() {
		System.out.println("人吃东西");
	}
	
	public void walk() {
		System.out.println("人走路");
	}
}

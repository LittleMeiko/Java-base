package com.atguigu.java;

/*
 * abstract关键字的使用：
 * 1.修饰类：抽象类，不能实例化，可以有构造器
 * 2.修饰方法：抽象方法，不能被重写
 */
public class AbstractTest {
	
	public static void main(String[] args) {
		Person person = new Student("Tom", 28);
		person.eat();
		person.walk();
	}
}

abstract class Person {
	String name;
	int age;
	
	public Person() {
		
	}
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public abstract void eat();
	
	public void walk() {
		System.out.println("人走路");
	}
}

class Student extends Person{
	
	public Student(String name,int age) {
		super(name, age);
	}

	@Override
	public void eat() {
		System.out.println("学生会跑步...");
	}
	
}

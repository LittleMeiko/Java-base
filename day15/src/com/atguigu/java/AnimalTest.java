package com.atguigu.java;

/*
 * 匿名内部类：当需要创建一个类的实例并且这个类只被创建一次时就可以使用匿名内部类 
 */
public class AnimalTest {
	
	public static void main(String[] args) {
		show(new Animal() {
			
			@Override
			public void walk() {
				System.out.println("鸟会飞");
			}
			
			@Override
			public void eat() {
				System.out.println("鸟吃虫子");
			}
		});
	}
	
	public static void show(Animal animal) {
		animal.eat();
		animal.walk();
	}
}

abstract class Animal {
	private String name;
	private int age;
	
	public Animal() {
		
	}
	
	public Animal(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public abstract void eat();
	
	public abstract void walk();
}

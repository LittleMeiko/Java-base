package com.atguigu.java;

/**
 * 	类的成员：属性、方法
 * @Description
 * @author Meiko
 * @version	
 * @date 2021-3-29-13:56:40
 *
 */
public class PersonTest {
	
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "Tom";
		p1.isMale = true;
		System.out.println(p1.name);
		System.out.println(p1.isMale);
		
		p1.eat();
		p1.sleep();
		p1.talk("Chinese");
	}
}

class Person {
	String name;
	int age = 1;
	boolean isMale;
	
	public void eat() {
		System.out.println("人可以吃饭");
	}
	
	public void sleep() {
		System.out.println("人可以睡觉");
	}
	
	public void talk(String language) {
		System.out.println("人可以说话，用的是:" + language);
	}
		
}

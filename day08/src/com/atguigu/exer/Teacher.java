package com.atguigu.exer;

public class Teacher {
	
	public String name;
	public int age;
	public int teachAge;
	public String course;
	
	public String say() {
		String info = name + "," + age + "," + teachAge + "," + course;
		
		return info;
	}
}

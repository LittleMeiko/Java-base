package com.atguigu.exer;

public class Student {
	
	public String name;
	public int age;
	public String major;
	public String interests;
	
	public String say() {
		String info = name + "," + age + "," + major + "," + interests;
		
		return info;
	}
}

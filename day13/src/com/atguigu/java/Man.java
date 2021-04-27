package com.atguigu.java;

public class Man extends Person {
	
	boolean isSomking;
	
	public Man() {
		
	}
	
	public Man(String name,int age,boolean isSomking) {
		super(name, age);
		this.isSomking = isSomking;
	}
	
	@Override
	public void eat() {
		System.out.println("男人要多吃肉");
	}
	
	public void earn() {
		System.out.println("男人要挣钱养家");
	}
}

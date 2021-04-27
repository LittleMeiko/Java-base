package com.atguigu.java;

public class Woman extends Person {
	
	boolean isBeauty;
	
	public Woman() {
		
	}
	
	public Woman(String name,int age,boolean isBeauty) {
		super(name, age);
		this.isBeauty = isBeauty;
	}
	
	@Override
	public void eat() {
		System.out.println("女人要少吃点减肥");
	}
	
	public void shop() {
		System.out.println("女人要购物");
	}
}

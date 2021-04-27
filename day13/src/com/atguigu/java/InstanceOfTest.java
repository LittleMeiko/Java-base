package com.atguigu.java;

/*
 * 	向下转型时为避免类型转换错误可以用 instanceof 关键字判断
 * 	a instanceof A
 * 
 * 
 */
public class InstanceOfTest {
	
	public static void main(String[] args) {
		Person p1 = new Man();
		p1.eat();
		p1.walk();
		if (p1 instanceof Man) {
			Man m1 = (Man)p1;
			m1.eat();
			m1.earn();
			System.out.println("**********Man**********");
		}
		
		Person p2 = new Woman();
		if (p2 instanceof Man) {
			Man m2 = (Man)p2;
			m2.earn();
			System.out.println("***********Woman************");
		}
	}
}

package com.atguigu.java;

/*
 * 接口的使用：
 * 1.使用interface关键字定义
 * 2.接口中不能包含构造方法
 * 3.JDK7及以前：接口中只能包含常量和抽象方法
 * 	 JDK8及以后：接口还可以包含静态方法和默认方法
 * 4.接口中的常量和方法即使不显示的声明为public的，它默认也是public
 * 
 */
public class InterfaceTest {
	
	public static void main(String[] args) {
		System.out.println(Flyable.MAX_SPEED);
		System.out.println(Flyable.MIN_SPEED);
		Flyable flyable = new Bee();
		flyable.fly();
		flyable.run();
	}
}

interface Flyable {
	public static final int MAX_SPEED = 7900;
	int MIN_SPEED = 1;
	
	public abstract void fly();
	
	void run();
	
	public static void show() {
		System.out.println("我是接口中的静态方法...");
	}
	
	default void Info() {
		System.out.println("我是接口中的默认方法...");
	}
}

class Bee implements Flyable {

	@Override
	public void fly() {
		System.out.println("蜜蜂会飞");
	}

	@Override
	public void run() {
		System.out.println("蜜蜂会跑");
	}
	
}

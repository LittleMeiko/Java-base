package com.atguigu.singleton;

import org.junit.Test;

public class SingletonTest {
	
	@Test
	public void testSingleton1() {
		Singleton1 instance1 = Singleton1.INSTANCE;
		Singleton1 instance2 = Singleton1.INSTANCE;
		System.out.println(instance1 == instance2);
	}
	
	@Test
	public void testSingleton2() {
		Singleton2 instance1 = Singleton2.INSTANCE;
		Singleton2 instance2 = Singleton2.INSTANCE;
		System.out.println(instance1 == instance2);
	}
	
	@Test
	public void testSingleton3() {
		Singleton3 instance1 = Singleton3.INSTANCE;
		Singleton3 instance2 = Singleton3.INSTANCE;
		
		System.out.println(instance1 == instance2);
	}
	
	@Test
	public void testSingleton4() {
		Singleton4 instance1 = Singleton4.getInstance();
		Singleton4 instance2 = Singleton4.getInstance();
		
		System.out.println(instance1 == instance2);
	}
	
	@Test
	public void testSingleton5() {
		Singleton5 instance1 = Singleton5.getInstance();
		Singleton5 instance2 = Singleton5.getInstance();
		
		System.out.println(instance1 == instance2);
	}
	
	@Test
	public void testSingleton6() {
		Singleton6 instance1 = Singleton6.getInstance();
		Singleton6 instance2 = Singleton6.getInstance();
		
		System.out.println(instance1 == instance2);
	}
}

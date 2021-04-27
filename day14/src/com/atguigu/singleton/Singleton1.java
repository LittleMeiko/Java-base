package com.atguigu.singleton;

/**
 * 
 * @Description 单例模式-饿汉式单例1
 * @author Meiko
 * @version	
 * @date 2021-4-20-14:11:49
 *
 */
public class Singleton1 {
	
	public static final Singleton1 INSTANCE = new Singleton1();
	
	private Singleton1() {}
}

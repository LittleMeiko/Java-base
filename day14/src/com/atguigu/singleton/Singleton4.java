package com.atguigu.singleton;

/**
 * 
 * @Description 单例模式-懒汉式单例1
 * @author Meiko
 * @version	
 * @date 2021-4-20-14:46:26
 *
 */
public class Singleton4 {
	private static Singleton4 instance;
	
	private Singleton4() {}
	
	public static Singleton4 getInstance() {
		if (instance == null) {
			instance = new Singleton4();
		}
		
		return instance;
	}
}

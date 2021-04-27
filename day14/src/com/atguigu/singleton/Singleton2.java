package com.atguigu.singleton;

/**
 * 
 * @Description 单例模式-饿汉式单例2
 * @author Meiko
 * @version	
 * @date 2021-4-20-14:26:31
 *
 */
public class Singleton2 {
	
	public static Singleton2 INSTANCE;
	
	private Singleton2() {}
	
	static {
		INSTANCE = new Singleton2();
	}
}

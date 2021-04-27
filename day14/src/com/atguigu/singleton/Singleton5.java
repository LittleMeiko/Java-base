package com.atguigu.singleton;

/**
 * 
 * @Description 单例模式-懒汉式单例2
 * @author Meiko
 * @version	
 * @date 2021-4-20-14:48:36
 *
 */
public class Singleton5 {
	private static Singleton5 instance;
	
	private Singleton5() {}
	
	public static Singleton5 getInstance() {
		if (instance == null) {
			synchronized (Singleton5.class) {
				if (instance == null) {
					instance = new Singleton5();
				}
			}
		}
		
		return instance;
	}
}

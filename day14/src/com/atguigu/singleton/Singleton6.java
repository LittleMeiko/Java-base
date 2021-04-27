package com.atguigu.singleton;

/**
 * 
 * @Description 单例模式-懒汉式单例3
 * @author Meiko
 * @version	
 * @date 2021-4-20-14:50:52
 *
 */
public class Singleton6 {
	private Singleton6() {}
	
	private static class InnerSingleton {
		private static final Singleton6 INSTANCE = new Singleton6();
  	}
	
	public static Singleton6 getInstance() {
		return InnerSingleton.INSTANCE;
	}
}

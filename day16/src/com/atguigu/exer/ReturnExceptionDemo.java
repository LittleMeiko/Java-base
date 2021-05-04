package com.atguigu.exer;

public class ReturnExceptionDemo {
	
	/*
	 * 输出语句顺序：
	 * 	1.进入方法A
	 * 	2.用方法A的finally
	 * 	3.制造异常
	 * 	4.进入方法B
	 * 	5.调用方法B的finally
	 * 
	 */
	public static void main(String[] args) {
		try {
			methodA();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		methodB();
	}
	
	static void methodA() {
		try {
			System.out.println("进入方法A");
			throw new RuntimeException("制造异常");
		} finally {
			System.out.println("用方法A的finally");
		}
	}
	
	static void methodB() {
		try {
			System.out.println("进入方法B");
			return;
		} finally {
			System.out.println("调用方法B的finally");
		}
	}
}


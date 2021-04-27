package com.atguigu.java;

/**
 * 
 * @Description 可变个数的形参 jdk5.0以后支持
 * @author Meiko
 * @version	
 * @date 2021-3-31-15:33:48
 *
 */
public class MethodArgsTest {
	
	public static void main(String[] args) {
		MethodArgsTest test = new MethodArgsTest();
		test.print("AA","BB","CC");
	}
	
	public void print(int i) {
		
	}
	
	public void print(String str) {
		
	}
	
	// 可变个数形参的方法
	public void print(String ...str) {
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
	
	public void print(int i,String ...str) {
		
	}
}

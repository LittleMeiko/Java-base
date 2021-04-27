package com.atguigu.java;

/**
 * 
 * @Description 方法重载：同名不同参
 * @author Meiko
 * @version	
 * @date 2021-3-31-14:50:37
 *
 */
public class OverLoadTest {
	
	
	public void getSum(int i,int j) {
		System.out.println("1");
	}
	
	public void getSum(int i,int j,int k) {
		System.out.println("2");
	}
	
	public void getSum(int i,String str) {
		System.out.println("3");
	}
	
	public void getSum(String str, int i) {
		System.out.println("4");
	}
}

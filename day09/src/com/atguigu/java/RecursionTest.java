package com.atguigu.java;

/**
 * 
 * @Description 递归方法
 * @author Meiko
 * @version	
 * @date 2021-4-1-10:21:01
 *
 */
public class RecursionTest {
	
	public static void main(String[] args) {
		// 计算1-100所有自然数的和
		// 方式1
		int sum1 = 0;
		for (int i = 1; i <= 100; i++) {
			sum1 += i;
		}
		System.out.println(sum1);
		// 方式2
		int sum2 = getSum(100);
		System.out.println(sum2);
		
		// 求1-100以内所有自然数的乘积
		int sum3 = getSum1(100);
		System.out.println(sum3);
	}
	
	public static int getSum(int n) {
		if (n == 1) {
			return n;
		}else {
			return n + getSum(n-1);
		}
	}
	public static int getSum1(int n) {
		if (n == 1) {
			return n;
		}else {
			return n * getSum(n-1);
		}
	}
}

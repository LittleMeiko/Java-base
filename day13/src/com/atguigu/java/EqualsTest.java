package com.atguigu.java;

/*
 * equals()的测试
 */
public class EqualsTest {
	
	public static void main(String[] args) {
		Custmoer cust1 = new Custmoer(1, "Tom", 18);
		Custmoer cust11 = new Custmoer(1, "Tom", 18);
		Custmoer cust2 = new Custmoer(1, "Jerry", 25);
		System.out.println(cust1 == cust2);
		System.out.println(cust1.equals(cust2));
		System.out.println(cust1.equals(cust11));
	}
}

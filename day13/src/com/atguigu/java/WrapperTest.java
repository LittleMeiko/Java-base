package com.atguigu.java;

import org.junit.Test;

/**
 * 
 * @Description 包装类的测试
 * @author Meiko
 * @version	
 * @date 2021-4-14-15:57:03
 *
 */
public class WrapperTest {
	
	// 基本数据类型 -> 包装类
	@Test
	public void test1() {
		int num = 10;
		Integer inn1 = new Integer(num);
		System.out.println(inn1.toString());
		
		Boolean b1 = new Boolean(true);
		System.out.println(b1.toString());
		Boolean b2 = new Boolean("true123");
		System.out.println(b2.toString());
	}
	
	// 包装类 -> 基本数据类型
	@Test
	public void test2() {
		Integer in1 = 10;
		System.out.println(in1.toString());
		int i1 = in1.intValue();
		System.out.println(i1);
	}
	
	@Test
	public void test3() {
		// 自动装箱： 基本数据类型 -> 包装类
		int num = 10;
		Integer in1 = num;
		System.out.println("Integer in1=" + in1.toString());
		method(num);
		
		// 自动拆箱：包装类 -> 基本数据类型
		int i2 = in1;
		System.out.println("int i2=" + i2);
	}
	
	// 基本数据类型、包装类  ->  String
	@Test
	public void test4() {
		Integer in1 = 10;
		String str1 = String.valueOf(in1);
		System.out.println(str1.toString());
		int i1 = 20;
		String str2 = String.valueOf(i1);
		System.out.println(str2.toString());
	}
	
	// String -> 基本数据类型、包装类  
	@Test
	public void test5() {
		String str1 = "123";
		int i1 = Integer.parseInt(str1);
		System.out.println(i1);
		Integer in1 = Integer.parseInt(str1);
		System.out.println(in1.toString());
		
		String str2 = "true";
		boolean b1 = Boolean.parseBoolean(str2);
		System.out.println(b1);
		String str3 = "true123";
		boolean b2 = Boolean.parseBoolean(str3);
		System.out.println(b2);
	}
	
	public void method(Object obj) {
		System.out.println(obj);
	}
}

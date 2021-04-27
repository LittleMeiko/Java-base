package com.atguigu.java;

import org.junit.jupiter.api.Test;

public class ReviewTest {
	
	@Test
	public void testArray() {
		int[] arr = new int[] {1,2,3};
		method(arr);
		char[] arr2 = new char[] {'a','b','c'};
		testCharArray(arr2);
	}
	
	public void method(Object obj) {
		System.out.println(obj.getClass());
		System.out.println(obj.getClass().getSuperclass());
	}
	
	public void testCharArray(char[] arr) {
		System.out.println(arr);
	}
	
}

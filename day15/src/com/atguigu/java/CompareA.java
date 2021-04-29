package com.atguigu.java;

public interface CompareA {
	
	public static void method() {
		System.out.println("CompareA:北京");
	}
	
	public default void method2() {
		System.out.println("CompareA:上海");
	}
	
	default void method3() {
		System.out.println("CompareA:深圳");
	}
}

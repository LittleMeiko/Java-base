package com.atguigu.exer;

import java.io.PrintStream;

public class ValueTransferExer {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		method(a, b);// 需要执行完此方法后打印出a=100,b=200
		
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}
	
	// 方法一
//	public static void method(int a,int b) {
//		a *= 10;
//		b *= 20;
//		System.out.println("a=" + a);
//		System.out.println("b=" + b);
//		System.exit(0);
//	}
	
	// 方法二
	public static void method(int a,int b) {
		PrintStream printStream = new PrintStream(System.out) {
			@Override
			public void println(String x) {
				if ("a=10".equals(x)) {
					x = "a=100";
				}else if ("b=10".equals(x)) {
					x = "b=200";
				}
				super.println(x);
			}	
		};
		System.setOut(printStream);
	}
}

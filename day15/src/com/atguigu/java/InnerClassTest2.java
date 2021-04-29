package com.atguigu.java;

/*
 * 	局部内部类的使用
 */
public class InnerClassTest2 {
	
	public Comparable getComparable() {
		
		// 方式一：
//		class MyComparable implements Comparable {
//			@Override
//			public int compareTo(Object o) {
//				return 0;
//			}
//		}
//		
//		return new MyComparable();
		
		return new Comparable() {
			@Override
			public int compareTo(Object o) {
				return 0;
			}
			
		};
	}
}

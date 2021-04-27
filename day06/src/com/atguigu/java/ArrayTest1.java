package com.atguigu.java;

/**
 * 	数组默认值
 * 	  整型：0
 * 	 浮点型：0.0
 * 	char：0  或 '\u0000' 
 *  boolean: false
 *	引用类型： String 默认为null
 * @Description
 * @author Meiko
 * @version	
 * @date 2021-3-25-11:10:33
 *
 */
public class ArrayTest1 {
	
	public static void main(String[] args) {
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		short[] arr1 = new short[5];
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		double[] arr2 = new double[5];
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		char[] arr3 = new char[5];
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		System.out.println();
		boolean[] arr4 = new boolean[5];
		for (int i = 0; i < arr4.length; i++) {
			System.out.print(arr4[i] + " ");
		}
		System.out.println();
		String[] arr5 = new String[5];
		for (int i = 0; i < arr5.length; i++) {
			System.out.print(arr5[i] + " ");
		}
	}
}

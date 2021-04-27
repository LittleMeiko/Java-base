package com.atguigu.exer;

/**
 * 	数组复制
 * @Description
 * @author Meiko
 * @version	
 * @date 2021-3-26-15:03:26
 *
 */
public class ArrayExer2 {
	
	public static void main(String[] args) {
		int[] arr1 = new int[10];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = (int)(Math.random() * 100);
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		int[] arr2 = new int[arr1.length];
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
	}
}

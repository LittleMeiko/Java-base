package com.atguigu.java;

/**
 * 	二维数组的使用
 * @Description
 * @author Meiko
 * @version	
 * @date 2021-3-25-15:20:39
 *
 */
public class ArrayTest3 {
	
	public static void main(String[] args) {
		//二维数组的默认值
		int[][] arr = new int[3][4];
		System.out.println(arr);//[[I@15db9742
		System.out.println(arr[0]);//[I@6d06d69c
		System.out.println(arr[0][0]);//0
		
		double[][] arr2 = new double[4][];
		System.out.println(arr2);// [[D@7852e922
		System.out.println(arr2[0]);// null
	}
}

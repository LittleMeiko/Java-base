package com.atguigu.java;

/**
 * 	算法考察：求数值型数组中元素的最大值、最小值、平均值、总和
 * @Description
 * @author Meiko
 * @version	
 * @date 2021-3-26-13:51:29
 *
 */
public class ArrayTest1 {
	
	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)((Math.random()*90) + 10);
		}
		
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("最大值为：" + max);
		
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("最小值为：" + min);
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("总和为：" + sum);
		
		int average = sum / arr.length;
		System.out.println("平均值为：" + average);
	}
}

package com.atguigu.java;

/**
 * 	数组排序
 * 	选择排序、交换排序、插入排序、归并排序、桶式排序、基数排序
 * @Description
 * @author Meiko
 * @version	
 * @date 2021-3-26-15:56:35
 *
 */
public class SortTest {
	
	public static void main(String[] args) {
		int[] arr = {-63,-36,-25,5,101,56,36,78,25,47,66,100,12};
		// 冒泡排序
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

package com.atguigu.java;

import java.util.Arrays;

/**
 * Arrays工具类：对数组操作的一些方法
 * @Description
 * @author Meiko
 * @version	
 * @date 2021-3-26-17:05:09
 *
 */
public class ArraysTest {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {2,3,4,1};
		boolean isEquals = Arrays.equals(arr1, arr2);
		System.out.println(isEquals);
		
		String arrInfo = Arrays.toString(arr1);
		System.out.println(arrInfo);
		
		Arrays.fill(arr1, 10);
		System.out.println(Arrays.toString(arr1));
		
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3 = {-63,-36,-25,5,101,56,36,78,25,47,66,100,12};
		Arrays.sort(arr3);
		int binarySearch = Arrays.binarySearch(arr3, 36);
		System.out.println(binarySearch);
	}
}

package com.atguigu.exer;

/**
 * 	二维数组遍历：每个元素求和
 * @Description
 * @author Meiko
 * @version	
 * @date 2021-3-25-17:11:28
 *
 */
public class ArraryExer1 {
	
	public static void main(String[] args) {
		int sum = 0;
		int[][] arr = {{3,5,8},{12,9},{7,0,6,4}};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		
		System.out.println(sum);
	}
}

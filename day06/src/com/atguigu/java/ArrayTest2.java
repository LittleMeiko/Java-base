package com.atguigu.java;

/**
 * 	二维数组
 * @Description
 * @author Meiko
 * @version	
 * @date 2021-3-25-15:02:32
 *
 */
public class ArrayTest2 {
	
	public static void main(String[] args) {
		int[][] arr = new int[][] {{1,2,3},{4,5},{6,7,8}};
		int[][] arr5 = {{1,2,3},{4,5},{6,7,8}};
		String[][] arr1 = new String[3][];
		String[][] arr2 = new String[3][2];
		String[] arr3[] = new String[3][2];
		String arr4[][] = new String[3][2];
		
		System.out.println(arr5[0][1]);
		System.out.println(arr2[1][1]);
		System.out.println(arr5.length);
		System.out.println(arr5[0].length);
		
		//二维数组遍历
		for (int i = 0; i < arr5.length; i++) {
			for (int j = 0; j < arr5[i].length; j++) {
				System.out.print(arr5[i][j] + " ");
			}
			System.out.println();
		}
	}
}

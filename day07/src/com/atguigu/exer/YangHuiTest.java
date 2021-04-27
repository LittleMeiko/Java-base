package com.atguigu.exer;

/**
 * 	使用二维数组打印一个10行的杨辉三角
 * 	第一行有1个元素，第n行有n个元素
 *	每行的第一个元素和最后一个元素都是1
 * 	 从第三行开始对于非第一个和最后一个元素满足此规律yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j]
 * @Description
 * @author Meiko
 * @version	
 * @date 2021-3-26-10:11:20
 *
 */
public class YangHuiTest {
	
	public static void main(String[] args) {
		int[][] yanghui = new int[10][];
		
		// 给二维数组的内层元素赋值
		for (int i = 0; i < yanghui.length; i++) {
			yanghui[i] = new int[i+1];
		}
		for (int i = 0; i < yanghui.length; i++) {
			for (int j = 0; j < yanghui[i].length; j++) {
				if (i >= 2) {
					if (j == 0 || j == yanghui[i].length-1) {
						yanghui[i][j] = 1;
					}else {
						yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
					}
				}else {
					yanghui[i][j] = 1;
				}
			}
		}
		
		//遍历二位数组
		for (int i = 0; i < yanghui.length; i++) {
			for (int j = 0; j < yanghui[i].length; j++) {
				System.out.print(yanghui[i][j] + "\t");
			}
			System.out.println();
		}
	}
}

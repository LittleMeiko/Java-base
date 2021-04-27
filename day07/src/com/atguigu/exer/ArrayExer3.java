package com.atguigu.exer;

/**
 * 	二分法查找：前提数组元素是有序的
 * @Description
 * @author Meiko
 * @version	
 * @date 2021-3-26-15:30:12
 *
 */
public class ArrayExer3 {
	
	public static void main(String[] args) {
		int[] arr = {-12,-8,45,63,78,89,100,256,333,400};
		int dest = 45;
		int head = 0;
		int end = arr.length - 1;
		boolean isFlag = true;
		while(true) {
			int middle = (head + end)/2;
			if (dest == arr[middle]) {
				isFlag = false;
				System.out.println("找到啦，元素下标为：" + middle);
				break;
			}else if(dest < arr[middle]){
				end = middle - 1;
			}else {
				head = middle + 1;
			}
		}
		
		if (isFlag) {
			System.out.println("没有找到");
		}
	}
}

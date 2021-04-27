package com.atguigu.java;

/**
 *	数组：多个相同类型的数据按照一定顺序排列成的集合，并使用一个名字命名
 *	引用数据类型
 * @Description
 * @author Meiko
 * @version	
 * @date 2021-3-24-16:35:28
 *
 */
public class ArrayTest {
	
	public static void main(String[] args) {
		int[] ids;
		ids = new int[]{1001,1002,1003,1004};
		String[] names = new String[5];
		names[0] = "胡歌";
		names[1] = "霍建华";
		names[2] = "赵又廷";
		names[3] = "张一山";
		names[4] = "李易峰";
		System.out.println(names.length);
		System.out.println(ids.length);
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}
}

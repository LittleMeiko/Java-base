package com.atguigu.exer;

import java.util.Scanner;

/**
 * 	从键盘输入5个学生的成绩，从中找出最高分
 * 	成绩>=最高分-10 评为A
 *	成绩>=最高分-20评为B
 *	成绩>=最高分-30评为C
 *	其余评为D
 * @Description
 * @author Meiko
 * @version	
 * @date 2021-3-25-14:00:03
 *
 */
public class ArrayDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入学生人数:");
		int count = scan.nextInt();
		int[] gradeArr = new int[count];
		int maxGrade = 0;
		for (int i = 0; i < count; i++) {
			System.out.println("请输入第" + (i+1) + "个学生的成绩：");
			gradeArr[i] = scan.nextInt();
			if (maxGrade < gradeArr[i]) {
				maxGrade = gradeArr[i];
			}
		}
		System.out.println("这" + count + "个学生成绩的最高分为:" + maxGrade);
		
		// 评级
		for (int i = 0; i < gradeArr.length; i++) {
			char level;
			if (gradeArr[i] >= maxGrade - 10) {
				level = 'A';
			}else if (gradeArr[i] >= maxGrade - 20) {
				level = 'B';
			}else if (gradeArr[i] >= maxGrade - 30) {
				level = 'C';
			}else {
				level = 'D';
			}
			System.out.println("第" + (i+1) + "个的学生成绩为:" + gradeArr[i] + ",评级为:" + level);
		}
	}
}

package com.atguigu.exer;

import java.util.Scanner;
import java.util.Vector;

public class ScoreTest {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Vector<Integer> scores = new Vector<Integer>();
		for (;;) {
			System.out.print("请输入学生成绩：");
			int input = scan.nextInt();
			if (input < 0) {
				break;
			}
			scores.add(input);
		}
		
		int maxScore = 0;
		for (int i = 0; i < scores.size(); i++) {
			if (maxScore <= scores.get(i)) {
				maxScore = scores.get(i);
			}
		}
		
		System.out.println("最高分为：" + maxScore);
	}
}

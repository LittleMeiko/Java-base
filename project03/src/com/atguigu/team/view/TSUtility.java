package com.atguigu.team.view;

import java.util.Scanner;

/**
 * 项目3的工具类，用来便捷的实现从键盘输入
 *
 * @versioin 1.0.0
 * @author Meiko
 * @date 2021-05-04 15:04:26
 */
public class TSUtility {
	private static final Scanner SCAN = new Scanner(System.in);
	
	/**
	 * 用于界面菜单的选择。 此方法读取键盘，如果用户键入‘1’-‘4’中的任意字符则方法返回。返回值为用户输入的值
	 *
	 * @author Meiko
	 * @date 2021-05-04 15:04:35
	 * @return char
	 */
	public static char readMenuSelection() {
		char c;
		for (;;) {
			String str = readKeyBoard(1, false);
			c = str.charAt(0);
			if (c != '1' && c != '2' && c != '3' && c != '4') {
				System.out.println("输入错误，请重新输入:");
			} else {
				break;
			}
		}

		return c;
	}
	
	/**
	 * 此方法提示并等待，直到用户按回车键后返回
	 *
	 * @author Meiko
	 * @date 2021-05-04 15:04:30
	 * @return void
	 */
	public static void readReturn() {
		System.out.println("按回车键继续...");
		readKeyBoard(100, true);
	}
	
	/**
	 * 从键盘读取一个不超过2位的整数，并将其作为方法的返回值
	 *
	 * @author Meiko
	 * @date 2021-05-04 15:04:34
	 * @return int
	 */
	public static int readInt() {
		int n;
		for (;;) {
			String str = readKeyBoard(2, false);
			try {
				n = Integer.parseInt(str);
				break;
			} catch (NumberFormatException e) {
				System.out.print("数字输入错误，请重新输入:");
			}
		}

		return n;
	}
	
	/**
	 * 用于确认选择的输入。此方法从键盘读取‘Y’或‘N’，并将其作为方法的返回值
	 *
	 * @author Meiko
	 * @date 2021-05-04 15:04:36
	 * @return char
	 */
	public static char readConfirmSelection() {
		char c;
		for (;;) {
			String str = readKeyBoard(1, false).toUpperCase();
			c = str.charAt(0);
			if (c == 'Y' || c == 'N') {
				break;
			} else {
				System.out.print("输入错误，请重新输入:");
			}
		}

		return c;
	}
	
	private static String readKeyBoard(int limit, boolean blankReturn) {
		String line = "";

		while (SCAN.hasNextLine()) {
			line = SCAN.nextLine();
			if (line.length() == 0) {
				if (blankReturn) {
					return line;
				} else {
					continue;
				}
			}

			if (line.length() < 1 || line.length() > limit) {
				System.out.print("输入长度(不大于" + limit + ")错误，请重新输入:");
				continue;
			}

			break;
		}

		return line;
	}
}

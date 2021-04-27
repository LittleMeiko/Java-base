package com.atguigu.p2.util;

import java.util.Scanner;

/**
 * 
 * @Description 项目2的工具类
 * @author Meiko
 * @version	
 * @date 2021-4-6-10:47:15
 *
 */
public class CMUtility {
	private static final Scanner SCAN = new Scanner(System.in);
	
	/*
	 * 	用于界面菜单的选择。
	 * 	此方法读取键盘，如果用户键入‘1’-‘5’中的任意字符则方法返回。返回值为用户输入的值
	 */
	public static char readMenuSelection() {
		char c;
		for (;;) {
			String str = readKeyBoard(1, false);
			c = str.charAt(0);
			if (c != '1' && c != '2' && c != '3' && c != '4' && c != '5') {
				System.out.println("输入错误，请重新输入:");
			}else {
				break;
			}
		}
		
		return c;
	}
	
	/*
	 * 	从键盘读取一个字符，并将其作为方法的返回值
	 */
	public static char readChar() {
		String str = readKeyBoard(1, false);
		char c = str.charAt(0);
		
		return c;
	}
	
	/*
	 *	 从键盘读取一个字符，并将其作为方法的返回值
	 * 	 如果用户不输入字符而直接回车，方法将以defaultValue作为返回值
	 */
	public static char readChar(char deafultValue) {
		String str = readKeyBoard(1, true);
		
		return (str.length() == 0) ? deafultValue : str.charAt(0);
	}
	
	/*
	 * 	从键盘读取一个不超过2位的整数，并将其作为方法的返回值
	 */
	public static int readInt() {
		int n;
		for(;;) {
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
	
	/*
	 * 	从键盘读取一个不超过2位的整数，并将其作为方法的返回值
	 * 	如果用户不输入字符而直接回车，那么方法将以defaultValue作为返回值
	 */
	public static int readInt(int defaultValue) {
		int n;
		for(;;) {
			String str = readKeyBoard(2, true);
			if (str.equals("")) {
				return defaultValue;
			}
			
			try {
				n = Integer.parseInt(str);
				break;
			} catch (NumberFormatException e) {
				System.out.print("数字输入错误，请重新输入:");
			}
		}
		
		return n;
	}
	
	/*
	 *	 从键盘读取一个长度不超过limit的字符串，并将其作为方法的返回值
	 */
	public static String readString(int limit) {
		return readKeyBoard(limit, false);
	}
	
	/*
	 * 	从键盘读取一个长度不超过limit的字符串，并将其作为方法的返回值
	 * 	如果用户不输入字符而直接回车，那么方法将以defaultValue作为返回值
	 */
	public static String readString(int limit, String defaultValue) {
		String str = readKeyBoard(limit, true);
		
		return str.equals("") ? defaultValue : str;
	}
	
	/*
	 * 用于确认选择的输入。此方法从键盘读取‘Y’或‘N’，并将其作为方法的返回值
	 */
	public static char readConfirmSelection() {
		char c;
		for(;;) {
			String str = readKeyBoard(1, false).toUpperCase();
			c = str.charAt(0);
			if (c == 'Y' || c == 'N') {
				break;
			}else {
				System.out.print("输入错误，请重新输入:");
			}
		}
		
		return c;
	}
	
	private static String readKeyBoard(int limit, boolean blankReturn) {
		String line = "";
		
		while(SCAN.hasNextLine()) {
			line = SCAN.nextLine();
			if (line.length() == 0) {
				if (blankReturn) {
					return line;
				}else {
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

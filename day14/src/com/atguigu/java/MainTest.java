package com.atguigu.java;

public class MainTest {
	
	public static void main(String[] args) {
		args = new String[10];
		Main.main(args);
	}
}

class Main {
	
	public static void main(String[] args) {
		args = new String[10];
		for (int i = 0; i < args.length; i++) {
			args[i] = "args" + i;
			System.out.println(args[i]);
		}
	}

	
}

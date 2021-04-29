package com.atguigu.java;

public class InnerClassTest {
	
	public void show() {
		int num = 10;
		
		class AA {
			public void info() {
				/*
				 * 	在局部内部类的方法中调用局部内部类所在的方法中的变量，此变量必须是final类型的
				 * 	jdk7及以前需要显示的将此变量声明为final类型的
				 * 	jdk8及以后可以省略不写
				 */
				//num = 20;
				System.out.println(num);
			}
		}
	}
}



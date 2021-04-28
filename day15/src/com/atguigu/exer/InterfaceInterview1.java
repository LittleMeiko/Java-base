package com.atguigu.exer;

public class InterfaceInterview1 extends B implements A{
	
	public void show() {
		//System.out.println(x);
		System.out.println(A.x);
		System.out.println(super.x);
	}
	
	public static void main(String[] args) {
		InterfaceInterview1 interfaceInterview1 = new InterfaceInterview1();
		interfaceInterview1.show();
	}
}

interface A {
	int x = 1;
}

class B {
	int x = 2;
}


package com.atguigu.java;

public class Java8InterfaceTest {
	
	public static void main(String[] args) {
		// 通过接口名.接口中的静态方法名调用接口中提供的静态方法
		CompareA.method();// CompareA:北京
		CompareA a = new SubClass();
		// 通过接口的实现类的对象.可以调用接口中的default方法
		a.method2();// SubClass:上海
		/*	
		 * 	"类优先原则"：
		 * 	如果实现类继承的父类和实现的接口中声明了同名同参数的方法
		 * 	那么在实现类没有重写此方法的情况下，默认调用的是父类中的同名同参数的方法
		 */
		a.mehtod3();// SuperClass:深圳
	}
}

class SubClass extends SuperClass implements CompareA {
	
	public void method2 () {
		System.out.println("SubClass:上海");
	}
}

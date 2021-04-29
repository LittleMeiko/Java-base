package com.atguigu.java;

public class Java8InterfaceTest {
	
	public static void main(String[] args) {
		// 通过接口名.接口中的静态方法名调用接口中提供的静态方法
		CompareA.method();
		CompareA a = new SubClass();
		// 通过接口的实现类的对象.可以调用接口中的default方法
		a.method2();
		
		a.method3();
	}
}


class SubClass extends SuperClass implements CompareA,CompareB{
	
	public void method2 () {
		System.out.println("SubClass:上海");
	}
	
	public void method3() {
		System.out.println("SubClass:深圳");
	}
	
	// 如何在实现类中调用父类、接口中被重写的方法
	public void myMethod() {
		method3();
		// 调用父类中被重写的方法
		super.method3();
		// 调用父接口中被重写的方法
		CompareA.super.method3();
		CompareB.super.method3();
	}
}

/*	
 * 	"类优先原则"：
 * 	如果实现类继承的父类和实现的接口中声明了同名同参数的方法
 * 	那么在实现类没有重写此方法的情况下，默认调用的是父类中的同名同参数的方法
 */
//class SubClass extends SuperClass implements CompareA{
//	
//	public void method2 () {
//		System.out.println("SubClass:上海");
//	}
//}


/*
 * "接口冲突"：
 * 	如果实现类实现了多个接口，而这个多个接口中定义了同名同参数的默认方法，那么在实现类没有
 * 	重写此方法的情况下就会报错。此时就必须在实现类中重写此方法
 * 
 */
//class SubClass implements CompareA,CompareB{
//	
//	public void method2 () {
//		System.out.println("SubClass:上海");
//	}
//	
//	public void method3() {
//		System.out.println("SubClass:深圳");
//	}
//}

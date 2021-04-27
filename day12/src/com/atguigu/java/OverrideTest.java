package com.atguigu.java;

/*
 * 	重写的原则：
 * 		发生在父子类中
 * 	"两同两小一大原则"：
 * 		两同：方法名相同、参数列表相同
 * 		两小：
 * 			返回值类型：为void和基本数据类型的时候必须相等，为引用数据类型的时候小于等于父类的
 * 			异常类型：	异常类型必须小于等于父类抛出的异常
 * 		一大：访问控制修饰符必须大于等于父类的
 * 
 */
public class OverrideTest {

	public static void main(String[] args) {
		Person p1 = new Student();
		p1.eat();
	}

}

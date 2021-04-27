package com.atguigu.java;

/*
 * 	子类继承父类之后，子类就继承了父类声明的所有属性和方法。父类中声明为private的属性和方法，子类继承了父类之后，仍然认为获取了父类中私有的结构
 * 	只是因为封装性的影响，使得子类不能直接调用父类的结构
 */
public class ExtendsTest {
	
	public static void main(String[] args) {
		Person person = new Person();
		person.age = 18;
		person.eat();
		
		Student student = new Student();
		student.age = 25;
		person.sleep();
	}
}

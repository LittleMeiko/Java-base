package com.atguigu.java2;

/*
 * 	多态性：
 * 		1.父类的引用指向子类的实例
 * 		2.虚拟方法调用：当调用父类和子类同名同参数的方法时，实际执行的是子类重写的方法，编译看左边，运行看右边
 * 		3.多态的前提：①继承关系 ②重写方法
 * 		4.对象的多态性只适用于方法，不适用于属性(属性是编译和运行都看左边)
 */
public class AnimalTest {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.eat();
		animal.shut();
		animal.show(2);
		Animal a1 = new Dog();
		a1.eat();
		a1.shut();
		new Dog();
		Dog dog = new Dog();
		dog.show(2.0);
		Animal a2 = new Cat();
		a2.eat();
		a2.shut();
	}
}

class Animal {
	public void eat() {
		System.out.println("动物：吃东西");
	}

	public void shut() {
		System.out.println("动物：叫");
	}

	public void show(int i) {
		System.out.println(i * i);
	}
}

class Dog extends Animal {

	@Override
	public void eat() {
		System.out.println("狗吃骨头");
	}

	@Override
	public void shut() {
		System.out.println("汪汪汪");
	}
	
	public void show(double i) {
		System.out.println(i + 1);
	}
}

class Cat extends Animal {
	@Override
	public void eat() {
		System.out.println("猫吃鱼");
	}

	@Override
	public void shut() {
		System.out.println("喵喵喵");
	}
}

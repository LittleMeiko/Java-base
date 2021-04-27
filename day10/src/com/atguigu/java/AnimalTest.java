package com.atguigu.java;

/**
 * 	高内聚：类的内部数据操作细节自己完成，外部不允许干涉
 * 	低耦合：仅对外暴露少量的方法用于使用
 * 	权限修饰符：private < 缺省 < protected < public
 * @Description 面向对象：封装与隐藏
 * @author Meiko
 * @version	
 * @date 2021-4-1-14:58:53
 *
 */
public class AnimalTest {
	
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.setName("Tom");
		animal.setAge(1);
		animal.setLegs(-4);
		animal.show();
	}
}

class Animal {
	private String name;
	private int age;
	private int legs;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		if (legs >= 0 && legs % 2 == 0) {
			this.legs = legs;
		} else {
			this.legs = 0;
		}
		
	}
	
	public void show() {
		System.out.println("name=" + this.name + ",age=" + this.age + ",legs=" + this.legs);
	}
}

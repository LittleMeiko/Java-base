package com.atguigu.java;

/**
 * 
 * @Description this关键字的使用：指当前对象 或 当前正在创建的对象
 * @author Meiko
 * @version	
 * @date 2021-4-2-10:20:30
 *
 */
public class PersonTest {
	
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Tom");
		person.setAge(18);
		
		System.out.println("name=" + person.getName() + ",age=" + person.getAge());
	}
}

class Person {
	private String name;
	private int age;
	
	public Person() {
		
	}
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
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

}

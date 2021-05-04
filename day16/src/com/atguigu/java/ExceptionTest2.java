package com.atguigu.java;

public class ExceptionTest2 {
	
	public static void main(String[] args) {
		Student student = new Student(-1002);
		System.out.println(student);
	}
}

class Student {
	private int id;
	
	public Student(int id) {
		if(id > 0) {
			this.id = id;
		}else{
			throw new MyException("输入不合法！");
		}
	}

	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}
	
}

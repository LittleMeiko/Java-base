package com.atguigu.exer;

public class InterfaceInterview2 {
	
	public static void main(String[] args) {
		
	}
}

interface AA {
	void play();
}

interface BB {
	void play();
}

interface C extends AA,BB {
	Ball ball = new Ball("basketball");
}

class Ball implements C {
	
	private String name;
	
	public Ball(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void play() {
		//ball = new Ball("football");// C接口中的常量是不能被改变的
		System.out.println(ball.getName());
	}
	
}

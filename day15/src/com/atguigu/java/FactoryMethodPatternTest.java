package com.atguigu.java;

/*
 * interface接口的运用：
 * 	设计模式--工厂方法模式(FactoryMethodPattern):创建者和调用者分离
 */
public class FactoryMethodPatternTest {
	
	public static void main(String[] args) {
		Car audi = new AudiFactory().getCar();
		Car byd = new BYDFactory().getCar();
		audi.run();
		byd.run();
	}

}

interface Car {
	void run();
}

class Audi implements Car {

	@Override
	public void run() {
		System.out.println("奥迪车在跑....");
	}
	
}

class BYD implements Car {

	@Override
	public void run() {
		System.out.println("比亚迪车在跑.....");
	}
	
}

// 工厂接口
interface CarFactory {
	
	Car getCar();
}

// 工厂类
class AudiFactory implements CarFactory {

	@Override
	public Car getCar() {
		
		return new Audi();
	}
	
}

// 工厂类
class BYDFactory implements CarFactory {

	@Override
	public Car getCar() {
		
		return new BYD();
	}
	
}

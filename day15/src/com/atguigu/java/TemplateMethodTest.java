package com.atguigu.java;

/*
 * 抽象类的运用：TemplateMethod(模板方法)设计模式
 */
public class TemplateMethodTest {
	
	public static void main(String[] args) {
		Template template = new SubTemplate();
		template.spendTime();
	}
}

abstract class Template {
	
	public void spendTime() {
		long start = System.currentTimeMillis();
		this.code();
		long end = System.currentTimeMillis();
		
		System.out.println("执行这段代码耗费的时间为:" + (end - start));
	}
	
	public abstract void code();
}

class SubTemplate extends Template {

	@Override
	public final void code() {
		int sum = 0;
		for (int i = 0; i <= 1000000000; i++) {
			sum += i;
		}
		
		System.out.println(sum);
	}
	
}

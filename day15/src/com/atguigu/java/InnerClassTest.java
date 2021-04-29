package com.atguigu.java;

/*
 * 	类的内部成员之五：内部类
 * 		成员内部类(静态的、非静态的)    vs  局部内部类(方法内、代码块内、构造器内)
 * 		
 * 
 * 
 */
public class InnerClassTest {
	
	public static void main(String[] args) {
		// 实例化静态内部类
		OuterClass.AA aa = new OuterClass.AA();
		aa.show();
		// 实例化非静态内部类
		OuterClass oc = new OuterClass();
		OuterClass.BB bb = oc.new BB();
		bb.show();
	}
}

class OuterClass {
	
	String name;
	int age;
	
	public void eat() {
		System.out.println("OuterClass的eat()");
	}
	
	// 静态成员内部类
	static class AA {
		int id;
		
		public AA() {
			System.out.println("静态内部类AA的构造方法...");
		}
		
		public void show() {
			System.out.println("静态内部类AA的show()");
		}
	}
	
	// 非静态成员内部类
	class BB {
		int id;
		
		public BB() {
			System.out.println("非静态内部类BB的构造方法...");
		}
		
		public void show() {
			OuterClass.this.eat();
			System.out.println("非静态内部类BB的show方法");
		}
	}
	
	public void method() {
		// 局部内部类
		class CC {
			
		}
	}
	
	{
		// 局部内部类
		class DD {
			
		}
	}
	
	public OuterClass() {
		// 局部内部类
		class EE {
			
		}
	}
}



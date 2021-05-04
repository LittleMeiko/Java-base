package com.atguigu.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;


/*
 *	异常的体系结构：
 *	Throwable：
 *		|-----Error
 *		|-----Exception:
 *		   |----编译时异常(checked):
 *				IOException
 *				ClassNotFoundException
 *		   |----运行时异常(unchecked):
 *				NullPoionterException
 *				ClassCastException
 *				NumberFormatExcepiton
 * 
 */
public class ExceptionTest {
	
	@Test
	public void test1() {
		File file = new File("hello.txt");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			int data = fis.read();
			while(data != -1) {
				System.out.println((char)data);
				data = fis.read();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	@Test
	public void test2() {
		int num = method();
		System.out.println(num);
	}
	
	public int method() {
		try {
			int a = 10;
			int b = 0;
			System.out.println(a / b);
			return 1;
		} catch (ArithmeticException e) {
			System.out.println("catch...");
			e.printStackTrace();
			return 2;
		} 
		finally {
			System.out.println("finally...");
			return 3;
		}
	}
}

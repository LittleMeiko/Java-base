package com.atguigu.java;

/*
 *	自定义异常 
 */
public class MyException extends RuntimeException{

	private static final long serialVersionUID = 848881995296183543L;
	
	public MyException() {
		
	}
	
	public MyException(String message) {
		super(message);
	}

}

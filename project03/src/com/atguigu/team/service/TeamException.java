package com.atguigu.team.service;

/**
 * 自定义异常类
 *
 * @version 1.0.0
 * @author Meiko
 * @date 2021-05-04 16:04:40
 */
public class TeamException extends Exception{
	static final long serialVersionUID = -3387514229948L;
	
	public TeamException(){
		super();
	}
	
	public TeamException(String msg){
		super(msg);
	}
}

package com.atguigu.java;

import org.junit.Test;

/**
 * 
 * @Description 单元测试
 * @author Meiko
 * @version	
 * @date 2021-4-14-14:43:46
 *
 */
public class JunitTest {
	
	@Test
	public void testEquals() {
		Integer i1 = 27;
		Integer i2 = 27;
		System.out.println(i1 == i2);// 比较地址值 true
		System.out.println(i1.equals(i2));// 比较值 true
	}
}

package com.atguigu.team.service;

/**
 * 表示员工的状态
 *
 * @version 1.0.0
 * @author Meiko
 * @date 2021-05-04 16:04:27
 */
public class Status {
	private final String NAME;

	private Status(String name) {
		this.NAME = name;
	}

	public static final Status FREE = new Status("FREE");
	public static final Status BUSY = new Status("BUSY");
	public static final Status VOCATION = new Status("VOCATION");

	public String getNAME() {
		return NAME;
	}

	@Override
	public String toString() {
		return NAME;
	}

}

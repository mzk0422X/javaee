package com.mzk.singletonPattern;

public class Tests {

	public static Tests INSTANCE = new Tests();
	
	//私有化构造方法
	public Tests() {
		System.out.println("public Tests...");
	}
	//提供返回该对象的静态方法
	public static Tests getTests(){
		return INSTANCE;
	}
}

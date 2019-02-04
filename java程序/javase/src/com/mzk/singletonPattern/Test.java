package com.mzk.singletonPattern;

/**
 * 
 * @author Administrator
 *
 */
public class Test {

	private static Test INSTANCE = new Test();
	
	//私有化构造方法
	private Test() {
		System.out.println("private Test...");
	}
	//提供返回该对象的静态方法
	public static Test getTest(){
		return INSTANCE;
	}
}

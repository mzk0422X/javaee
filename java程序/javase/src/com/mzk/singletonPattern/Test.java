package com.mzk.singletonPattern;

/**
 * 
 * @author Administrator
 *
 */
public class Test {

	private static Test INSTANCE = new Test();
	
	//˽�л����췽��
	private Test() {
		System.out.println("private Test...");
	}
	//�ṩ���ظö���ľ�̬����
	public static Test getTest(){
		return INSTANCE;
	}
}

package com.mzk.singletonPattern;

public class Tests {

	public static Tests INSTANCE = new Tests();
	
	//˽�л����췽��
	public Tests() {
		System.out.println("public Tests...");
	}
	//�ṩ���ظö���ľ�̬����
	public static Tests getTests(){
		return INSTANCE;
	}
}

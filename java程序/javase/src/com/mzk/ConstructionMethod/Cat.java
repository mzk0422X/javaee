package com.mzk.ConstructionMethod;

public class Cat {

	private String name;
	
	//Ĭ�ϵĹ��췽��
	public Cat() {
		// TODO Auto-generated constructor stub
		System.out.println("Ĭ�ϵĹ��췽����������...");
	}
	
	//�������Ĺ��췽��
	public Cat(String name) {
		this.name = name;
	}
	
	//����һ������
	public  void Shout() {
		 System.out.println(name + "�����˽���������");
	}
}

package com.mzk.ConstructionMethod;

public class Cat {

	private String name;
	
	//默认的构造方法
	public Cat() {
		// TODO Auto-generated constructor stub
		System.out.println("默认的构造方法被调用了...");
	}
	
	//带参数的构造方法
	public Cat(String name) {
		this.name = name;
	}
	
	//定义一个方法
	public  void Shout() {
		 System.out.println(name + "发出了叫声。。。");
	}
}

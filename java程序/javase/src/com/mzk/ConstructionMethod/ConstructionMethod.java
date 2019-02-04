package com.mzk.ConstructionMethod;

public class ConstructionMethod {

	public static void main(String[] args) {
		
		//实例化了一个Cat类无参的构造方法
		Cat cat = new Cat();
		
		//实例化了一个Cat类带参数的构造方法
		Cat cats = new Cat("小橘猫");
		cats.Shout();
	}
}

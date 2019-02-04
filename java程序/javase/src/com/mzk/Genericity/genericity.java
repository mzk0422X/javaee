package com.mzk.Genericity;

public class genericity <T>{
	T temp;
	public void save(T temp) {
		//在创建save()方法时，指定参数类型为T
		this.temp = temp;
	}
	//在创建get()方法时，指定返回值类型为T
	public T get() {
		return temp;
	}
}

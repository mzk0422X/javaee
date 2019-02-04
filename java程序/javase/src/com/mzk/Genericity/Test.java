package com.mzk.Genericity;

//泛型
public class Test {
	public static void main(String[] args) {
		//在实例化对象时，传入参数为Integer类型
		genericity<Integer> pool = new genericity<Integer>();
		pool.save(new Integer(1));
		Integer temp = pool.get();
		System.out.println(temp);
		//在实例化对象进，传入参数为String类型
		genericity<String> string1 = new genericity<String>();
		string1.save(new String("A"));
		String temp1 = string1.get();
		System.out.println(temp1);
	}
}

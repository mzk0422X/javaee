package com.mzk.singletonPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 = Test.getTest();
		Test t2 = Test.getTest();
		/**
		 * The constructor Test() is not visible
		 *		Test t3 = new Test();
		 *
		 * public 的作用是允许外部直接访问该变量
		 * static 的作用是让外部可以使用"类名.变量名"的方式来访问变量
		 * final 的作用是禁止外部对该变量进行修改		
		 */
		System.out.println(t1==t2);
		Tests ts1 = Tests.getTests();
		Tests ts2 = Tests.getTests();
		Tests ts3 = new Tests();
		System.out.println(ts1.equals(ts2));
	}

}

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
		 * public �������������ⲿֱ�ӷ��ʸñ���
		 * static �����������ⲿ����ʹ��"����.������"�ķ�ʽ�����ʱ���
		 * final �������ǽ�ֹ�ⲿ�Ըñ��������޸�		
		 */
		System.out.println(t1==t2);
		Tests ts1 = Tests.getTests();
		Tests ts2 = Tests.getTests();
		Tests ts3 = new Tests();
		System.out.println(ts1.equals(ts2));
	}

}

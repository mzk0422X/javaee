package com.mzk.Genericity;

//����
public class Test {
	public static void main(String[] args) {
		//��ʵ��������ʱ���������ΪInteger����
		genericity<Integer> pool = new genericity<Integer>();
		pool.save(new Integer(1));
		Integer temp = pool.get();
		System.out.println(temp);
		//��ʵ������������������ΪString����
		genericity<String> string1 = new genericity<String>();
		string1.save(new String("A"));
		String temp1 = string1.get();
		System.out.println(temp1);
	}
}

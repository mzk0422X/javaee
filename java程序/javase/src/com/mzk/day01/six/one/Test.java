package com.mzk.day01.six.one;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * ʹ��ѭ����26����дӢ����ĸ���ֵ�˳�����һά���飬Ȼ����ʹ��������(����ʹ�����������)��
		 * ����ٸ��ݴ������ַ����鴴��һ���ַ�����������ַ���
		 */
		char a[] = new char[26],c;
		int i;
		for(i=0;i<26;i++) {
			a[i]=(char)('A'+i);
		}
		System.out.println(a);
		for(i=0;i<13;i++) {
			c=a[i];
			a[i]=a[25-i];
			a[25-i]=c;
		}
		String s= new String(a);
		System.out.println(s);
		System.out.println();
	}

}

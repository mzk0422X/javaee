package com.mzk.day01.six.one;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 使用循环把26个大写英文字母按字典顺序存入一维数组，然后再使其逆序存放(不得使用另外的数组)，
		 * 最后再根据处理后的字符数组创建一个字符串，输出此字符串
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

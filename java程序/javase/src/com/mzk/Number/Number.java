package com.mzk.Number;

public class Number {

	public static void main(String[] args) {
		Integer x = 5;//装箱
		x = x + 10;//拆箱
		System.out.println(x);
		//当x被赋为整形值时，由于x是一个对象，所以编绎器要对x进行装箱。然后，为了使x能进行加运算，所以要对x进行拆箱
	}
}

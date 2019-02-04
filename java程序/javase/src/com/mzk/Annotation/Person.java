package com.mzk.Annotation;

@Action(author="flypie",data=100)	//使用自定义注解，有默认值的成员可以不用赋值，其余成员都要复值
public class Person {

	@Action(author="flypie",data=90)
	public void live() {
		
	}
}

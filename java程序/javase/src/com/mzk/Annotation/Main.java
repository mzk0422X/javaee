package com.mzk.Annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		
		//使用类加载器加载类
		Class c = Class.forName("com.mzk.Annotation.Person");
		
		// 1.找到类上的注解
		//判断类是否被指定注解注解
		if(c.isAnnotationPresent(Action.class)) {
			//拿到类上的指定注解实例
			Action a = (Action) c.getAnnotation(Action.class);
			System.out.println(a.data());
		}
		
		// 2.找到方法上的注解
		Method[] ms = c.getMethods();
		for(Method m : ms) {
			//判断方法是否被指定注解注解
			if(m.isAnnotationPresent(Action.class)) {
				//拿到类上的指定注解实例
				Action a = (Action) c.getAnnotation(Action.class);
				System.out.println(a.data());
			}
		}
		
		// 3.另外一种方法
		for(Method m : ms) {
			//拿到类上的注解集合
			Annotation[] as = m.getAnnotations();
			for(Annotation a : as) {
				//判断指定注解
				if(a instanceof Action) {
					Action d = (Action) a;
					System.out.println(d.data());
				}
			}
		}
	}
}

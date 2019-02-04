package com.mzk.Annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		
		//ʹ���������������
		Class c = Class.forName("com.mzk.Annotation.Person");
		
		// 1.�ҵ����ϵ�ע��
		//�ж����Ƿ�ָ��ע��ע��
		if(c.isAnnotationPresent(Action.class)) {
			//�õ����ϵ�ָ��ע��ʵ��
			Action a = (Action) c.getAnnotation(Action.class);
			System.out.println(a.data());
		}
		
		// 2.�ҵ������ϵ�ע��
		Method[] ms = c.getMethods();
		for(Method m : ms) {
			//�жϷ����Ƿ�ָ��ע��ע��
			if(m.isAnnotationPresent(Action.class)) {
				//�õ����ϵ�ָ��ע��ʵ��
				Action a = (Action) c.getAnnotation(Action.class);
				System.out.println(a.data());
			}
		}
		
		// 3.����һ�ַ���
		for(Method m : ms) {
			//�õ����ϵ�ע�⼯��
			Annotation[] as = m.getAnnotations();
			for(Annotation a : as) {
				//�ж�ָ��ע��
				if(a instanceof Action) {
					Action d = (Action) a;
					System.out.println(d.data());
				}
			}
		}
	}
}

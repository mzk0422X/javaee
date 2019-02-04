package com.mzk.Annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Target��ʾע������ö���ElementType.TYPE��ʾ�࣬ElementType.METHOD��ʾ����
@Target({ElementType.TYPE,ElementType.METHOD})
//��ʾע��ı������ƣ�RetentionPolicy.RUNTIME��ʾ����ʱע��
@Retention(RetentionPolicy.RUNTIME)
//��ʾ��ע��ɼ̳�
@Inherited
//��ʾ��ע��������ĵ�
@Documented
public @interface Action {

	String author();
	int data() default 0;
	
}

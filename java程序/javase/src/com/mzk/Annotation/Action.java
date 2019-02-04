package com.mzk.Annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Target表示注解的作用对象，ElementType.TYPE表示类，ElementType.METHOD表示方法
@Target({ElementType.TYPE,ElementType.METHOD})
//表示注解的保留机制，RetentionPolicy.RUNTIME表示运行时注解
@Retention(RetentionPolicy.RUNTIME)
//表示该注解可继承
@Inherited
//表示该注解可生成文档
@Documented
public @interface Action {

	String author();
	int data() default 0;
	
}

package com.mzk.Genericity;

public class genericity <T>{
	T temp;
	public void save(T temp) {
		//�ڴ���save()����ʱ��ָ����������ΪT
		this.temp = temp;
	}
	//�ڴ���get()����ʱ��ָ������ֵ����ΪT
	public T get() {
		return temp;
	}
}

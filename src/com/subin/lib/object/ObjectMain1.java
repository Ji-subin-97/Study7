package com.subin.lib.object;

public class ObjectMain1 {

	public static void main(String[] args) {
		//객체 생성
		//클래스명 참조변수명 = new 생성자();
		
		Object object = new Object();
		
		//멤버변수, 멤버메서드 호출
		//참조변수명.변수명
		//참조변수명.메서드명([인자값]);
		
		int num = object.hashCode();
		System.out.println(num);
		
		String str = object.toString();
		System.out.println(str);
		System.out.println(object);
		
		boolean a = object.equals(object);
		System.out.println(a);
		
		Test test = new Test();
		test.hashCode();
	}

}

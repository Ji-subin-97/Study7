package com.subin.lib.exception;

public class Exception_2 {

	public static void main(String[] args) {
		int [] ar = {1,2,3,4,5,6};
		
//		Test2 test2 = new Test2();
//		test2.t2(ar);
		
		Test1 test1 = new Test1();
		try {
			test1.t1(ar);
		}catch (Exception e) {
			System.out.println("예외 처리 시작");
		}

	}

}

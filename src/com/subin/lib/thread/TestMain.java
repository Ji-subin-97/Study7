package com.subin.lib.thread;

public class TestMain {

	public static void main(String[] args) {
		Test1 test1 = new Test1();
		Test2 test2 = new Test2();
		Test3 test3 = new Test3();
		Thread thread = new Thread(test3);
		
		
		test1.start();
		test2.start();
		thread.start();
		
	}

}

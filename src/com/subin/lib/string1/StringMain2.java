package com.subin.lib.string1;

public class StringMain2 {

	public static void main(String[] args) {
		
		String name = "hello world";
		
		System.out.println(name.charAt(1));
		
		name = "991021-1234567";
		
		//남녀 판별
		
		char check = name.charAt(7);
		
		if(check == '1') {
			System.out.println("남자");
		}
		else {
			System.out.println("여자");
		}
		
		check = name.charAt(200);
	}

}

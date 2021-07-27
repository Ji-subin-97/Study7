package com.subin.lib.string1;

public class StringMain3 {

	public static void main(String[] args) {
		String name = "Hellow World";
		char ch = 'o';
		boolean check = true;
		int num = 0;
		int count = 0;
		while(check) {	
			num = name.indexOf(ch,num);
			
			System.out.println(num);
			if(num == -1) {
				check = false;
			}
			else {
				num++;
				count++;
			}
		}
		System.out.println(count);
	}

}

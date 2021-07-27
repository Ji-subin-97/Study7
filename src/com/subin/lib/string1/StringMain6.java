package com.subin.lib.string1;

public class StringMain6 {

	public static void main(String[] args) {
		String weather = "서울-대구-대전-광주-부산-제주";
		
		String [] citys = weather.split("-");
		
		for(int i=0;i<citys.length;i++) {
			System.out.println(citys[i]);
		}
		
		
		weather = "32 89 45 67";
		
		String [] cc = weather.split(" ");
		
		for(int i=0;i<cc.length;i++) {
			System.out.println(cc[i]);
		}
		
		String name = " Te st     ";
		name = name.trim();
		
		String names = "";
		char [] name2 = name.toCharArray();
		
		for(int i=0;i<name2.length;i++) {
			if(name2[i]==' ') {
				continue;
			}
			else {
			names = names + name2[i];
			}
		}
		

		System.out.println(names);
		System.out.println(name.equals("Test"));
	}

}

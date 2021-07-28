package com.subin.lib.list;

import java.util.ArrayList;

public class Array_List3 {

	public static void main(String[] args) {
		
		Member mem = new Member();
		
		mem.setId("1234");
		mem.setPw("5678");
		
		ArrayList<Member> memAr = new ArrayList<>();
		
		memAr.add(mem);
		
		memAr.add(new Member());
		
		
		System.out.println(memAr.get(0));
		
	}

}

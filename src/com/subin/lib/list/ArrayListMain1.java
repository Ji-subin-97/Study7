package com.subin.lib.list;

import java.util.ArrayList;

public class ArrayListMain1 {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		//같은 데이터타입을 모음
		ar.add("First");
			
		ar.add(true);
		ar.add('a');
		ar.add("aaaa");
		ar.add("subink");
		ar.add(3.12);
		
		ar.add(1, "add");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		System.out.println("---------------");
		ar.add("first");
		ar.add(2);
		ar.add(3.333);
		ar.add('4');
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		String s0 = (String)ar.get(0);
		int s1 = (Integer)ar.get(1);
	}

}

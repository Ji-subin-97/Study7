package com.subin.lib.set;

import java.util.HashSet;
import java.util.Iterator;

public class SetMain1 {

	public static void main(String[] args) {
		
		HashSet<Integer> hashSet = new HashSet<>();
		
		hashSet.add(1);
		hashSet.add(200);
		hashSet.add(100);
		hashSet.add(400);
		hashSet.add(300);
		
		System.out.println(hashSet);
		System.out.println(hashSet.size());
		
		//전체 출력
		Iterator<Integer> it = hashSet.iterator();
		
		while(it.hasNext()) {
			int i = it.next();
			System.out.println(i);
		}

	}

}

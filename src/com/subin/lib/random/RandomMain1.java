package com.subin.lib.random;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class RandomMain1 {

	public static void main(String[] args) {
		Random random = new Random();
		
		
//		int num = 0;
//		for(int i=0; i<6; i++) {
//			num = random.nextInt(46);
//			System.out.println(num);
//		}
		
//		Lotto lotto = new Lotto();
//		
//		HashSet<Integer> ar = lotto.makeLotto();
//		Iterator<Integer> it = ar.iterator();
//
//		while(it.hasNext()) {
//			int i = it.next();
//			System.out.println(i);
//		}
		
		Password password = new Password();
		password.makePassword();
	}

}

package com.subin.lib.random;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Lotto {

	//makeLotto 메서드명
	// 1-45 6개 중복 X
	
	public HashSet<Integer> makeLotto(){
		
		HashSet<Integer> ar = new HashSet();
		
		Random random = new Random();
		int num = 0;
		
		while(ar.size() != 6) {
			num = random.nextInt(45) + 1;
			ar.add(num);
		}
		
		return ar;
	}
	
	
	public void makeLotto2() {
		
	}
}
	
	
//	public ArrayList<Integer> makeLotto(){
//		
//		// 1-45 번호를 6개 랜덤하게 뽑기
//		
//		ArrayList<Integer> ar = new ArrayList<>();
//		
//		Random random = new Random();
//		int num = 0;
//		
//		for(int i=0; i<6 ; i++) {
//			num = random.nextInt(45) + 1;
//			ar.add(num);
//		}
//		
//		return ar;
//	}

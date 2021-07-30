package com.subin.lib.exception;

public class Test2 {
	
	public void t2(int [] nums){
		
		try {
			System.out.println(nums.length);
			System.out.println(nums[8]);
		}catch (Exception e) {
			System.out.println("없는 인덱스 번호");
		}
		
	}
}

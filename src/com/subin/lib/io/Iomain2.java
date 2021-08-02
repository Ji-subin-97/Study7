package com.subin.lib.io;

import java.util.Calendar;
import java.util.UUID;

public class Iomain2 {

	public static void main(String[] args) {
		
		String fileName = "";
		
		//fileName을 생성하는 코드
		//몇번을 돌리든 중복 x
		
		Calendar calendar = Calendar.getInstance();
		long time = calendar.getTimeInMillis();
		
		fileName = String.valueOf(time);
		
		System.out.println(fileName);
		
		fileName = UUID.randomUUID().toString();
		
		System.out.println(fileName);

	}

}

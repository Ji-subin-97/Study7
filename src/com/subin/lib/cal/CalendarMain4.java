package com.subin.lib.cal;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarMain4 {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		//2021년 7월 29일
		int year = ca.get(Calendar.YEAR);
		int month = ca.get(Calendar.MONTH+1);
		int date = ca.get(Calendar.DATE);
		
		Date d1 = ca.getTime();
		
		String pattern="yyyy년 MM월 dd일 E요일";
		
		SimpleDateFormat sf = new SimpleDateFormat(pattern);
		String result = sf.format(d1);
		
		System.out.println(result);
	}

}

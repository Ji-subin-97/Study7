package com.subin.lib.cal;

import java.util.Date;
import java.util.Calendar;

public class CalendarMain2 {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		
		Date d1 = ca.getTime();
		long l2 = ca.getTimeInMillis();
		System.out.println(d1);
		
		ca.set(ca.YEAR, 2121);
		d1 = ca.getTime();
		System.out.println(d1);
		
		ca.set(Calendar.DATE, 30);
		d1 = ca.getTime();
		System.out.println(d1);
		
		ca.set(1997, 12, 17);
		d1 = ca.getTime();
		System.out.println(d1);
		
		long l1 = ca.getTimeInMillis();  //밀리세컨드
		System.out.println(l1);
		
		long l3 = l2 - l1;
		System.out.println(l3);
		
		System.out.println("초 :" + l3/1000L);
		System.out.println("분 :" + l3/(1000L*60));
		System.out.println("시 :" + l3/(1000L*60*60));
		System.out.println("일 :" + l3/(1000L*60*60*24));
		System.out.println("년 :" + (l3/(1000L*60*60*24*365)));
	}

}

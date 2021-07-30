package com.subin.lib.cal;

import java.util.Calendar;
import java.util.Date;

public class CalendarMain1 {

	public static void main(String[] args) {
		
		Calendar ca = Calendar.getInstance(); // new GregorianCalendar();
		
		System.out.println(ca); // toString();
		
		int a = ca.get(ca.YEAR);
		
		System.out.println(a);
		
		int b = ca.get(ca.MONTH)+1;
		
		System.out.println(b);
		
		int c = ca.get(ca.DATE);
		
		System.out.println(c);
		
		// 시 분 초
		int d = ca.get(ca.HOUR);
		int e = ca.get(ca.MINUTE);
		int f = ca.get(ca.SECOND);
		
		System.out.println(d + "시" + e + "분" + f + "초");
		
		Date date = ca.getTime();
		System.out.println(date);
	}

}

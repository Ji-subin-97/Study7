package com.subin.lib.wrapper;


public class WrapperMain1 {

	public static void main(String[] args) {

		int num=1;
		String str = "1";
		
		int n = Integer.parseInt(str);
		
		System.out.println(Integer.BYTES);
		
		int n1 = 10;
		Integer n2 = Integer.valueOf(n1);
		Double d = Double.valueOf(3.1);
		
		n1 = n2.intValue();
	}

}

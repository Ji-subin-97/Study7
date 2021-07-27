package com.subin.lib.token;

import java.util.StringTokenizer;

public class TokenMain3 {

	public static void main(String[] args) {
		String str1 = "korea-usa-france"; // split
		String [] s = str1.split("-");
		
		for(int i=0;i<s.length;i++) {
			Nation n = new Nation();
			n.setName(s[i]);
		}
		
		String str2 = "note10-100-iphone12-130-zflip-300"; // token
		
		StringTokenizer st2 = new StringTokenizer(str2, "-");
		
		while(st2.hasMoreTokens()) {
			Phone phone = new Phone();
			phone.setName(st2.nextToken());
			phone.setPrice(st2.nextToken());
		}
	}

}

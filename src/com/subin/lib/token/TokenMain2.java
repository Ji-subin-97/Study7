package com.subin.lib.token;

import java.util.StringTokenizer;

public class TokenMain2 {

	public static void main(String[] args) {


		String str = "korea-USA-china*france*UK-canada-germany";

		str = str.replace("*", "-");
		str = str.toUpperCase();
		
		StringTokenizer st = new StringTokenizer(str , "-");
		
		//나라별로 파싱
		//모든 나라이름은 대문자로 출력
		
		while(st.hasMoreTokens()) {
			String s = st.nextToken();
			System.out.println(s);
		}
	}

}

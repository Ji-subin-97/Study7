package com.subin.lib.random;

import java.util.Random;

public class Password {
	
	
	//makePassword
	//랜덤한 패스워드 생성
	//대문자, 소문자, 숫자 조합
	//8글자
	//a4bcD5P0
	//1. 대문자, 소문자 ,숫자 결정 랜덤 random.nextInt(3)+1;
	//2. 글자 랜덤  아스키코드
	
	
	public void makePassword() {
		
		//------------객체------------------//
		Random random = new Random(); 
		//---------------------------------//
		
		String final_pw = "";  // 컴퓨터가 만든 최종 비밀번호 총 8자리
		
		char [] random_char = new char[8]; // 문자 하나씩의 배열
		
		for(int i=0; i<random_char.length; i++) {
			int select = random.nextInt(3)+1; // 대문자,소문자,숫자 랜덤선택
			if(select == 1) {
				random_char[i] = (char)(random.nextInt(90-65+1)+65); // 아스키코드 범위별로나옴
			}
			else if(select == 2) {
				random_char[i] = (char)(random.nextInt(122-97+1)+97);;
			}
			else if(select == 3) {
				random_char[i] = (char)(random.nextInt(57-48+1)+48);;
			}
			else {
				
			}
			
			final_pw += random_char[i];
		}
		
		
		System.out.println(final_pw);
	}
	
	
	
	
}

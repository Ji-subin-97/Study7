package com.subin.lib.wrapper;

import java.util.Scanner;

public class WraaperMain2 {

	public static void main(String[] args) {
		//주민번호 입력
		//991224-1234567
		//몇살....
		//3-5 : 봄
		//6-8 : 여름
		//9-11 : 가을
		//12-2 : 겨울
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호앞자리를 입력해주세요 :");
		String front = sc.next();
		System.out.print("주민번호뒷자리를 입력해주세요 :");
		String back = sc.next();
		
		String mynum = front + "-" + back;
		String year = front.substring(0,2);
		year = "19" + year;
		
		int age = 0 ;
		age = 2021 - Integer.parseInt(year) + 1;
		
		String month_string = front.substring(2,4);
		int month = Integer.parseInt(month_string); 
		String empty = ""; //계절
		
		if(3<=month && month<=5) {
			empty = "봄";
		}
		else if(6<=month && month<=8){
			empty = "여름";
		}
		else if(9<=month && month<=11) {
			empty = "가을";
		}
		else if(12<=month || month<=2){
			empty = "겨울";
		}
		
		String sex = back.substring(0,1);
		int sex_int = Integer.parseInt(sex);
		String sex_empty = ""; // 성
		if(sex_int%2 == 1) {
			sex_empty = "남성";
		}
		else {
			sex_empty = "여성";
		}
		
		System.out.println("당신의 주민등록번호는 " + mynum + " 입니다.");
		System.out.println("당신의 나이는 " + age + "살 입니다.");
		System.out.println("당신의 성별은 " + sex_empty + " 입니다.");
		System.out.println("당신이 태어난 계절은 " + empty + " 입니다.");
		

	}

}

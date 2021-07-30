package com.subin.lib.exception;

import java.util.Scanner;

public class Exception_1 {

	public static void main(String[] args) {
		System.out.println("Start");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력");
		try {
			int num = sc.nextInt();
			
			int num2 = 20;
		
			int num3 = num2 / num;
			//예외가 발생하면 예외 객체 생성
			//new ArithmeticException();
				
			System.out.println(num3);
		}catch (Exception e) {
			// 예외가 발생 했을 때 실행
			System.out.println("예외 처리 끝");
		}
		
		
		System.out.println("Finish");

	}

}

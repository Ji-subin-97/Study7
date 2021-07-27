package com.subin.lib.string1;

import java.util.Scanner;

public class StringMain5 {

	public static void main(String[] args) {
		String n = "Hello World";
		
		n = n.replace('l', 'z');
		
		System.out.println(n);
		
		n = n.substring(6);
		
		System.out.println(n);
		
		System.out.println("------------------");
		Scanner sc = new Scanner(System.in);
		//
		System.out.println("저장할 파일명을 입력");
		//a.txt, iu.jpg
		//입력 받은 파일이 이미지 파일 여부 판단
		
		String [] files = {"jpg", "gif", "png", "svg"};
		
		String file = sc.next();
		boolean check = false;
		
		String ext = file.substring(file.lastIndexOf(".")+1);
		System.out.println(ext);
		
//		if(ext.equals("jpg") || ext.equals("gif") || ext.equals("png") || ext.equals("svg")) {
//			System.out.println("이미지 파일입니다.");
//		}
//		else {
//			System.out.println("이미지 파일이 아닙니다.");
//		}
		
		for(int i=0;i<file.length();i++) {
			if(ext.equals(files[i])) {
				check = true;
				break;
			}
		}
		
		if(check == true) {
			System.out.println("이미지 파일입니다.");
		}
		else {
			System.out.println("이미지 파일이 아닙니다.");
		}
	}

}

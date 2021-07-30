package com.subin.lib.file;

import java.io.File;
import java.util.Scanner;

public class FileMain2 {

	public static void main(String[] args) {
		
		File file = new File("C:\\");
		Scanner sc = new Scanner(System.in);
		System.out.println("폴더명을 입력해주세요.");
		file = new File(file,sc.next());
		
		try {
			if(file.exists()) {
				file.delete();
				System.out.println("지워짐");
			}
			else {
				System.out.println("안지워짐");
			}
//			if(file.exists()) {
//				System.out.println("존재하는 폴더입니다.");
//			}
//			else {
//				System.out.println("존재하지않는 폴더입니다.");
//				file.mkdir();
//			}
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}

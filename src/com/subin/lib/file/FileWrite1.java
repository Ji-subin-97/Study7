package com.subin.lib.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite1 {
	
	private Scanner sc;
	
	public FileWrite1() {
		sc = new Scanner(System.in);
	}
	
	public void write2() {
		//id, pw, age 입력
		//c -> test -> member.txt
		//id - pw - age
		System.out.print("아이디를 입력하세요: ");
		String id = sc.next();
		System.out.print("비밀번호를 입력하세요: ");
		String pw = sc.next();
		System.out.print("나이를 입력하세요.");
		int age = sc.nextInt();
		
		File file = new File("c:\\test","member.txt");
		
		try {
			FileWriter fw = new FileWriter(file,true);
			fw.write(id + "-" + pw + "-" + age + "\r\n");
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public void write() {
		File file = new File("c:\\test","study1.txt");
		
		System.out.println("메세지를 입력하세요.");
		String message = sc.nextLine();
		
		try {
			FileWriter fw = new FileWriter(file, true);
			fw.write(message+"\r\n");
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}

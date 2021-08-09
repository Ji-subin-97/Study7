package com.subin.lib.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {

	public static void main(String[] args) {
		
		// 1 . server 접속
		// 2 . 1 점심메뉴 2 저녁메뉴 3 종료
		
		
		Socket sc = null;
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		Scanner scanner = new Scanner(System.in);
		
		try {
			sc = new Socket("172.30.1.27", 8080);
			System.out.println("서버 접속 성공");
			
			os = sc.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			
			is = sc.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			
			boolean check = true;
			
			while(check) {
				
				System.out.println("1.점심 2.저녁 3.종료");
				System.out.print("=>");
				int select = scanner.nextInt();
			
				bw.write(select + "\r\n");
				bw.flush();
				
	
				String getmsg = br.readLine();
				
				if(getmsg.equals("종료")) {
					System.out.println("시스템 종료");
					check = false;
					continue;
				}
				
				System.out.println("선택된 음식은 : " + getmsg + "입니다.");
				
				}
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				scanner.close();
				br.close();
				ir.close();
				is.close();
				bw.close();
				ow.close();
				os.close();
				sc.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}

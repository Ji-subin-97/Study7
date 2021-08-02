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


public class Client1 {

	public static void main(String[] args) {
		//Client 용
		//Ip + port -> Socket
		
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
			System.out.println("서버와 접속이 성공");
			
			boolean check = true;
			
			while(check) {
				//서버로 메세지 전송
				System.out.println("서버로 보낼 메세지 입력 : ");
				String message = scanner.nextLine();
				
				//byte 처리
				os = sc.getOutputStream();
				//char 처리
				ow = new OutputStreamWriter(os);
				//string 처리
				bw = new BufferedWriter(ow);
				bw.write(message+"\r\n");
				bw.flush();
				System.out.println("서버로 전송 성공");
				
				if(message.equals("q") || message.equals("Q")) {
					check = false;
					System.out.println("q와 Q를 입력함");
					continue;
				}
				
				is = sc.getInputStream();
				ir = new InputStreamReader(is);
				br = new BufferedReader(ir);
				
				String msg = br.readLine();
				
				if(msg.equals("q") || msg.equals("Q")) {
					check = false;
					System.out.println("q와 Q를 입력함");
					continue;
				}
				
				System.out.println("서버에서 보낸 메세지");
				System.out.println("Server : " + msg);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				scanner.close();
				bw.close();
				ow.close();
				os.close();
				br.close();
				ir.close();
				is.close();
				
				sc.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

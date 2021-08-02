package com.subin.lib.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server1 {

	public static void main(String[] args) {
		//Server 용
		//Client 연결 요청이 오면 1:1 Socket을 생성해 주는
		//Server Socket이 있음.
		ServerSocket ss= null;
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		Scanner scanner = new Scanner(System.in);
		
		try {
			ss = new ServerSocket(8080);
			System.out.println("Client 접속 기다리는 중");
			
			boolean check = true;
			
			Socket sc = ss.accept();
			System.out.println("Client와 연결 성공");
				
			while(check) {
				is = sc.getInputStream();
				ir = new InputStreamReader(is);
				br = new BufferedReader(ir);
				
				String message = br.readLine();
				
				if(message.equals("q") || message.equals("Q")) {
					check = false;
					System.out.println("q와 Q를 입력함");
					continue;
				}
				
				System.out.println("Client : " + message);
				
				System.out.println("클라이언트로 보낼 메세지 입력 :");
				message = scanner.nextLine();
				
				if(message.equals("q") || message.equals("Q")) {
					check = false;
					System.out.println("q와 Q를 입력함");
					continue;
				}
				
				os = sc.getOutputStream();
				ow = new OutputStreamWriter(os);
				bw = new BufferedWriter(ow);
				bw.write(message+"\r\n");
				bw.flush();
				System.out.println("클라이언트로 전송 성공");
				
			
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
				
				ss.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

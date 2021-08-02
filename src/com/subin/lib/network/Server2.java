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
import java.util.ArrayList;
import java.util.Random;

public class Server2 {

	public static void main(String[] args) {
		
		ServerSocket ss = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		ArrayList<String> lunch = new ArrayList<>();
		lunch.add("김치찌개");
		lunch.add("오므라이스");
		lunch.add("샌드위치");
		lunch.add("치즈라면");
		lunch.add("먹다남은 치킨");
		lunch.add("비빔밥");
		
		ArrayList<String> dinner = new ArrayList<>();
		dinner.add("햄버거");
		dinner.add("냉면");
		dinner.add("돈가스");
		dinner.add("카레라이스");
		dinner.add("김밥");
		dinner.add("보쌈");
		
		// 클라이언트 접속 준비
		// 클라이언트와 접속 성공
		// 클라이언트로 메세지 수신
		//  1 이면 점심메뉴 중에서 하나를 전송
		//  2 이면 저녁메뉴 중에서 하나를 전송
		//  3. 종료
		
		try {
			ss = new ServerSocket(8080);
			Socket sc = ss.accept();
			
			System.out.println("클라이언트와 접속 성공");
			
			boolean check = true;
			
			os = sc.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			
			Random random = new Random();
			
			
			
			while(check) {
				is = sc.getInputStream();
				ir = new InputStreamReader(is);
				br = new BufferedReader(ir);
				
				int select = br.read();
				int num = 0;
				
				if(select==1) {
					 num = random.nextInt(lunch.size());
					 String a = lunch.get(num);
					 bw.write("점심음식 : " + a + "\r\n");
					 bw.flush();
				}
				else if(select==2) {
					num = random.nextInt(lunch.size());
					 String a = dinner.get(num);
					 bw.write("저녁음식 : " + a + "\r\n");
					 bw.flush();
				}
				else {
					bw.write("종료\r\n");
					bw.flush();
					check = false;
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
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

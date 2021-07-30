package com.subin.lib.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Iomain1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		System.out.println("Start");
		
		try {
//			int num = is.read();
//			char ch = (char)num;
			String str = br.readLine();
			
			System.out.println(str);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		System.out.println("Finish");

	}

}

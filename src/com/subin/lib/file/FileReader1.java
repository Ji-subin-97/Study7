package com.subin.lib.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileReader1 {

	public static void main(String[] args) {
		
		File file = new File("c:\\test", "name.txt");
		
		try {
			FileReader fr = new FileReader(file);
			
			//보조스트림
			BufferedReader br = new BufferedReader(fr);
			ArrayList<FileMember> ar = new ArrayList<FileMember>();  // 파일 멤버 넣기
			
			while(true) {
				String str = br.readLine();
				if(str==null) {
					break;
				}
				String [] strs = str.split(",");
				
				FileMember fileMember = new FileMember();
				
				Integer age = Integer.parseInt(strs[2]);
				
				fileMember.setId(strs[0]);
				fileMember.setPw(strs[1]);
				fileMember.setAge(age);
				
				ar.add(fileMember);
		
			}
			
			for(int i=0;i<ar.size();i++) {
				System.out.println("id :" + ar.get(i).getId());
				System.out.println("pw :" + ar.get(i).getPw());
				System.out.println("age :" + ar.get(i).getAge());
				System.out.println("-----------------------------");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

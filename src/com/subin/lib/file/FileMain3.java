package com.subin.lib.file;

import java.io.File;

public class FileMain3 {

	public static void main(String[] args) {
		File file = new File("c:\\");
		
		String [] names = file.list();
		
		for(int i=0;i<names.length;i++) {
			File file2 = new File(file,names[i]);
			boolean check = file2.isFile();
			boolean check2 = file2.isDirectory();
			
			if(check) {
				System.out.println(names[i] + " 파일");
			}
			if(check2) {
				System.out.println(names[i] + " 폴더");
			}
		}
	}

}

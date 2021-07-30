package com.subin.lib.file;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
		
		//File file = new File("C:\\test\\study1.txt");
		
		File file = new File("C:\\test");
		
		boolean result = file.exists();
		result = file.isFile();
		System.out.println(result);
		
		//------------------------------------------
		file = new File(file,"study1.txt");
		
		result = file.exists();
		System.out.println(result);

	}

}

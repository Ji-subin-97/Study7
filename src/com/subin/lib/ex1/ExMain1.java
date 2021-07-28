package com.subin.lib.ex1;

import java.util.ArrayList;

public class ExMain1 {

	public static void main(String[] args) {
		
		MemberDAO memberDAO = new MemberDAO();
		
		ArrayList<MemberDTO> arrayList = memberDAO.memberInit();
		
		for(int i=0;i<arrayList.size();i++) {
			System.out.println("id :" + arrayList.get(i).getId());
			System.out.println("pw :" + arrayList.get(i).getPw());
			System.out.println("age :" + arrayList.get(i).getAge());
			System.out.println("=================================");
		}
		
		
		memberDAO.memberAdd(arrayList);
		
		for(int i=0;i<arrayList.size();i++) {
			System.out.println("id :" + arrayList.get(i).getId());
			System.out.println("pw :" + arrayList.get(i).getPw());
			System.out.println("age :" + arrayList.get(i).getAge());
			System.out.println("=================================");
		}
	}

}

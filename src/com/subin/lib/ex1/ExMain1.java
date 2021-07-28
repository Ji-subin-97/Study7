package com.subin.lib.ex1;

import java.util.ArrayList;

public class ExMain1 {

	public static void main(String[] args) {
		
		MemberController memberController = new MemberController();
		memberController.start();
		
//		MemberDAO memberDAO = new MemberDAO();
//		
//		ArrayList<MemberDTO> arrayList = memberDAO.memberInit();
//		
//		for(int i=0;i<arrayList.size();i++) {
//			System.out.println("id :" + arrayList.get(i).getId());
//			System.out.println("pw :" + arrayList.get(i).getPw());
//			System.out.println("age :" + arrayList.get(i).getAge());
//			System.out.println("=================================");
//		}
//		
//		
//		memberDAO.memberAdd(arrayList);
//		
//		for(int i=0;i<arrayList.size();i++) {
//			System.out.println("id :" + arrayList.get(i).getId());
//			System.out.println("pw :" + arrayList.get(i).getPw());
//			System.out.println("age :" + arrayList.get(i).getAge());
//			System.out.println("=================================");
//		}
//		
//		int result = memberDAO.memberDelete(arrayList);
//		
//		if(result>0) {
//			System.out.println("삭제성공");
//		}
//		else {
//			System.out.println("삭제실패");
//		}
//		for(int i=0;i<arrayList.size();i++) {
//			System.out.println("id :" + arrayList.get(i).getId());
//			System.out.println("pw :" + arrayList.get(i).getPw());
//			System.out.println("age :" + arrayList.get(i).getAge());
//			System.out.println("=================================");
//		}
//		
//		
//		MemberDTO memberDTO = memberDAO.memberLogin(arrayList);
//		
//		if(memberDTO!=null) {
//			System.out.println("로그인 성공");
//		}
//		else {
//			System.out.println("로그인 실패");
//		}
		
	}

}

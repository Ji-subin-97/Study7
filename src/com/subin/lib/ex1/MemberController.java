package com.subin.lib.ex1;

import java.util.ArrayList;
import java.util.Scanner;

import com.subin.lib.list.Member;

public class MemberController {
	
	private Scanner sc;
	private MemberDAO memberDAO;
	private MemberDTO memberDTO;
	private ArrayList<MemberDTO> arrayList;
	private boolean flag;
	
	public MemberController() {
		sc = new Scanner(System.in);
		memberDAO = new MemberDAO();
		memberDTO = new MemberDTO();
		arrayList = memberDAO.memberInit();
		flag = true;
	}
	
	public void start() {
		
		//1. 회원가입
		//2. 로그인
		//3. 종료
		
		while(flag) {
			
			MemberSection memberSection = new MemberSection();
			
			if(MemberSection.session.get("member")!=null) {
				afterLogin();
			}
			else {
				flag = beforeLogin();
			}
			
			
		}
	}
	private void afterLogin() {
		System.out.println("1. 마이페이지");
		System.out.println("2. 로그아웃");
		System.out.println("3. 종료");
		System.out.print("원하는 작업 : ");
		int select = sc.nextInt();
		
		switch (select) {
		case 1:
			System.out.println("자기 정보 출력");
			MemberView memberView = new MemberView();
			memberView.view();
			break;
		case 2:
			MemberSection.session.remove("member");
			break;
		default:
			flag = false;
		}
	}
	
	private boolean beforeLogin() {
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 종료");
		System.out.print("원하는 작업 : ");
		int select = sc.nextInt();
		
		switch (select) {
		case 1:
			memberDAO.memberAdd(arrayList);
			break;
		case 2:
			MemberDTO memberDTO = memberDAO.memberLogin(arrayList);
			if(memberDTO!=null) {
				System.out.println("로그인 성공");
				MemberSection.session.put("member", memberDTO);
			}
			else {
				System.out.println("로그인 실패");
			}
			break;
		default:
			flag = false;
		}
		
		return flag;
	}
}

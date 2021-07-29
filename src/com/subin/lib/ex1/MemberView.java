package com.subin.lib.ex1;

public class MemberView{
	
	public void view() {
		//myPage 선택시 실행
		//id, pw, age 출력
		//단, 메서드의 head는 변경 x
		//멤버변수 선언 x
		MemberSection memberSection = new MemberSection();
		MemberDTO memberDTO = new MemberDTO();
		
		memberDTO = memberSection.session.get("member");
		
		System.out.println(memberDTO.getId());
		System.out.println(memberDTO.getPw());
		System.out.println(memberDTO.getAge());
		
	}
}

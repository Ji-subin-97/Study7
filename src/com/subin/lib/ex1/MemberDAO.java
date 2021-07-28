package com.subin.lib.ex1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class MemberDAO {
	
	private String info;
	
	public MemberDAO() {
		info = "iu,pw1,32,suji,pw2,27,choa,pw3,30";
		
		//memberInit
		//info에 있는 정보를 파싱해서 MemberDTO 객체생성해서 대입
		//ArrayList에 각각추가하고 리턴
		
	}
	
	
	//memberAdd
	//키보드로 id,pw,age 를 입력 받아서 MemberDTO 멤버변수
	//매개변수로 ArrayList를 받아서 생성한 MemberDTO 추가
	public void memberAdd(ArrayList<MemberDTO> meDtos) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ID를 입력해주세요 :");
		String id = sc.next();
		System.out.print("PW를 입력해주세요 :");
		String pw = sc.next();
		System.out.print("AGE를 입력해주세요 :");
		String age = sc.next();
		int age2 = Integer.parseInt(age);
		
		MemberDTO memberDTO = new MemberDTO();
		
		memberDTO.setId(id);
		memberDTO.setPw(pw);
		memberDTO.setAge(age2);
		
		ArrayList<MemberDTO> arrayList = meDtos;
		
		arrayList.add(memberDTO);
	}
	
	
	public ArrayList<MemberDTO> memberInit() {
		
		StringTokenizer st = new StringTokenizer(info, ",");
		ArrayList<MemberDTO> arrayList = new ArrayList<>();
		
		while(st.hasMoreTokens()) {
			MemberDTO dto = new MemberDTO();
			dto.setId(st.nextToken());
			dto.setPw(st.nextToken());
			String age = st.nextToken();
			int age2 = Integer.parseInt(age);
			dto.setAge(age2);
			arrayList.add(dto);
		}
		
		
		return arrayList;
	}
	
}

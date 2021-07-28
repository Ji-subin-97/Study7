package com.subin.lib.ex1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class MemberDAO {
	
	private String info;
	private Scanner sc;
	
	public MemberDAO() {
		info = "iu,pw1,32,suji,pw2,27,choa,pw3,30";
		sc = new Scanner(System.in);
		
		//memberInit
		//info에 있는 정보를 파싱해서 MemberDTO 객체생성해서 대입
		//ArrayList에 각각추가하고 리턴
		
	}
	
	//memberLogin
	//Scanner 로 아이디 비밀번호
	//해당 DTO 리턴
	public MemberDTO memberLogin(ArrayList<MemberDTO> arrayList) {
		
		MemberDTO result = null;
		
		System.out.print("ID입력 :");
		String id = sc.next();
		System.out.print("PW입력 :");
		String pw = sc.next();
		
		for(int i=0;i<arrayList.size();i++) {
			String idCheck = arrayList.get(i).getId();
			String pwCheck = arrayList.get(i).getPw();
			
			if(id.equals(idCheck) && pw.equals(pwCheck)) {
				result = arrayList.get(i);
				break;
			}	
		}
		
		return result;
	}
	
	
	
	//memberDelete
	//Scanner로 id,pw를 입력받아서 MemberDTO 멤버변수
	//매개변수로 ArrayList를 받아서 입력받은 id, pw 둘다 일치하는
	//것을 찾아서 삭제
	public int memberDelete(ArrayList<MemberDTO> arrayList) {
		
		System.out.print("삭제할 ID입력 :");
		String id = sc.next();
		System.out.print("삭제할 PW입력 :");
		String pw = sc.next();
		
		int result = 0;
		
		for(int i=0;i<arrayList.size();i++) {
			String idCheck = arrayList.get(i).getId();
			String pwCheck = arrayList.get(i).getPw();
			
			if(id.equals(idCheck) && pw.equals(pwCheck)) {
				System.out.println("ID와 PW가 일치하므로 삭제합니다.");
				arrayList.remove(i);
				result = 1;
				break;
			}	
		}
		
		return result;
	}
	
	
	
	//memberAdd
	//키보드로 id,pw,age 를 입력 받아서 MemberDTO 멤버변수
	//매개변수로 ArrayList를 받아서 생성한 MemberDTO 추가
	public void memberAdd(ArrayList<MemberDTO> meDtos) {
		
		MemberDTO memberDTO = new MemberDTO();
		
		System.out.print("ID를 입력해주세요 :");
		memberDTO.setId(sc.next());
		System.out.print("PW를 입력해주세요 :");
		memberDTO.setPw(sc.next());
		System.out.print("AGE를 입력해주세요 :");
		memberDTO.setAge(sc.nextInt());
		
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

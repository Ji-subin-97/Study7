package com.subin.lib.wrapper;

import java.util.StringTokenizer;

public class WrapperMain3 {

	public static void main(String[] args) {
		
		String jumin = "971217-1198111";
		//9 9 1 2 2 4 1 2 3 4 5 6 : 7은 검증번호
	// *  2 3 4 5 6 7 8 9 2 3 4 5
	//    18 + 27 + 4 + 10 + 12 + 28 + 8 + 18 +6--....
		
		//2. 122 를 11로 나누어서 나머지를 구하기
		//3. 1 11에서 나머지를 빼기 검증번호랑 같으면 올바른 번호
		//3_1 11에서 나머지를 뺏을 때 두자리 이상이라면
		//4. 3번에서 나온 결과를 다시 10으로 나누어서 그나머지를 구하기
		//5. 나머지 숫자랑 체크번호랑 같으면 올바른 번호
		
		String [] st = jumin.split("-");
		String front = st[0];	// 주민번호 앞자리
		String back = st[1];	// 주민번호 뒷자리
		String backs = back.substring(0,6);	// 뒷자리에서 검증번호빼고
		
		String back_final = back.substring(6); // 검증번호
		System.out.println(back_final);
		int back_finalInt = Integer.parseInt(back_final);
		
		
		String [] front_st = front.split(""); // 앞번호 나누기
		String [] back_st = backs.split(""); // 뒷번호 나누기
		
		int [] tt = new int[front_st.length]; // 각 숫자곱 저장 장소
		
		for(int i=0;i<front_st.length;i++) {
			tt[i] = Integer.parseInt(front_st[i]) * Integer.parseInt(back_st[i]);
		} // 각 곱 저장하기
		
		int total = 0; // 총합
		for(int i=0;i<tt.length;i++) {
			 total += tt[i];
		}
		System.out.println(total);
		
		int namozi = total % 11;
		int checkNum = 11 - namozi;
		
		if(checkNum == back_finalInt) {
			System.out.println("올바른 번호입니다.");
		}
		else if(checkNum>=10) {
			checkNum = checkNum % 10;
			if(checkNum==back_finalInt) {
				System.out.println("올바른 번호입니다.");
			}
			else {
				System.out.println("올바르지않은 번호입니다.");
			}
		}
		else {
			System.out.println(checkNum);
			System.out.println("올바르지 않은 번호입니다.");
		}
	}

}

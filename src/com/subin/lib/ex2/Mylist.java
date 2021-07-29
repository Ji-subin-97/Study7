package com.subin.lib.ex2;

import java.util.ArrayList;

public abstract class Mylist implements DataIO{
	
	//DataIO 구현
	@Override
	public void add(ArrayList<Integer> ar, int num) {
		ar.add(0, num);
	}
	@Override
	public void remove(ArrayList<Integer> ar) {
		ar.remove(ar.size()-1);
	}
	
	//add 오버라이딩 num을 list에 맨 앞에 추가
	//데이터를 입력
	
	//remove list에서 무조건 마지막 요소를 삭제
}

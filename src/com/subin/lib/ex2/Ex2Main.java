package com.subin.lib.ex2;

import java.util.ArrayList;
import java.util.Random;

public class Ex2Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> ar = new ArrayList<>();
		
		ar.add(1);
		ar.add(2);
		ar.add(3);
		
		Mylist mylist = new Mylist() {
		};
		
		mylist.add(ar, 4);
		mylist.remove(ar);
		
		Random ran = new Random();
		System.out.println(ran);
		
		System.out.println(ar);
	}

}

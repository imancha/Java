package com.imancha.generic;

import java.util.ArrayList;

public class ArrayListTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ai=new ArrayList<Integer>();
		ai.add(30);
		ai.add(50);
		ai.add(2,55);	//	sisip 55 pada index 2
		ai.add(70);
		for(int i=0;i<ai.size();i++){
		System.out.println(ai.get(i));
		}
		ai.remove(1);// hapus data ke-2
		System.out.println(ai);
		ai.clear();// kosongkan array
		System.out.println(ai);
	}
}

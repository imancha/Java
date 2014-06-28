package com.imancha.generic;

import java.util.LinkedList;

public class LinkedListTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("B");
		ll.add("C");
		ll.add("D");
		ll.add("E");
		System.out.println(ll);
		ll.addLast("Z");
		ll.addFirst("A");
		System.out.println(ll);
		String a = ll.removeFirst();
		System.out.println("Pertama : " + a);
		System.out.println("Kedua : " + ll.get(1));		
		ll.clear();
		System.out.println(ll);
	}

}

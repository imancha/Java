package com.imancha.generic;

import java.util.Stack;

public class StackTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();

		int d = 182107850;

		do {
			int s = d % 16;
			d = d / 16;
			stack.push(s);
		} while (d != 0);
		String hexa = "0123456789ABCDEF";
		while(!stack.isEmpty()){
			System.out.print(hexa.charAt(stack.pop()));
		}
	}

}

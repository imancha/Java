package com.imancha.test;

public class investValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float total = 20000;
		System.out.println("Original investment : $"+total);
		
		total = total + (total * .4F);
		System.out.println("After one year      : $"+total);
		
		total = total - 1500F;
		System.out.println("After two year      : $"+total);
		
		total = total + (total * .12F);
		System.out.println("After three year    : $"+total);
	}

}

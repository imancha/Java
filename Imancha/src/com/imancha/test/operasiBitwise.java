package com.imancha.test;

public class operasiBitwise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 5;
		int y = 6;
		
		System.out.println("x     = "+x);
		System.out.println("y     = "+y);
		System.out.println("x & y = "+(x&y));
		System.out.println("x | y = "+(x|y));
		System.out.println("x ^ y = "+(x^y));
		
		int z = ~y;
		System.out.println("z     = "+z);
	}

}

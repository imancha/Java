package com.imancha.test;
import java.util.Scanner;

/**
 * @author Imancha
 * 
 */
public class scanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		System.out.print("Input : ");
		String input = in.next();

		for (int i = 0; i < input.length(); i++) {
			System.out.print(input.charAt(i));

			// Character.isDigit(input.charAt(i)) ? System.out.println(" isDigit")
			// : System.out.println(" isHuruf");
		}
	}

}

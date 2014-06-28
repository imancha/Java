package com.imancha.compiler;

import java.util.Scanner;

public class Compilator {
	private final static Scanner scanner = new Scanner(System.in);
	private final static String end = "END";

	public static void main(String[] args) {
		String input = "";

		do {
			input = scanner.nextLine();
		} while (input.equals(end));

		
		System.out.println(input);
	}
}

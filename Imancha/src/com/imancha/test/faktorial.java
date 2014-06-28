package com.imancha.test;
import java.util.Scanner;

public class faktorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner myScanner = new Scanner(System.in);
		
		byte n;
		
		System.out.print("Masukkan bilangan faktorial ? "); 
		n = myScanner.nextByte();
		
		System.out.println("n   n!   ");
		System.out.println("----------------");
		
		for(int i=1; i<=n; i++){
			int hasil = 1;
			for(int j=1; j<=i; j++){
				hasil *= j;
			}
			System.out.printf("%-3d %-10d \n", i,hasil);
		}
	}

}

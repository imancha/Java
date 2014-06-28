package com.imancha.test;
import java.util.Scanner;


public class biodata {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner myScanner = new Scanner(System.in);
		
		String nim;
		String nama;
		byte umur;
		char jk;
		
		System.out.print("NIM  : "); nim = myScanner.nextLine();
		System.out.print("Nama : "); nama = myScanner.nextLine();
		System.out.print("Umur : "); umur = myScanner.nextByte();
		System.out.print("JK   : "); jk = myScanner.findWithinHorizon(".", 0).charAt(0);
		System.out.println();
		System.out.println("NIM  : "+nim);
		System.out.println("Nama : "+nama);
		System.out.println("Umur : "+umur);
		System.out.println("JK   : "+jk);
	}

}

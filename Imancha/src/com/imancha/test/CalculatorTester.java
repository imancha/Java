package com.imancha.test;
public class CalculatorTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Calculator C = new Calculator();

		C.IsiOperan1(7);
		C.IsiOperan2(5);

		System.out.println("Tambah  : " + C.Tambah());
		System.out.println("Kurang  : " + C.Kurang());
		System.out.println("Kali    : " + C.Kali());
		System.out.println("Bagi    : " + C.Bagi());
		System.out.println("Pangkat : " + C.Pangkat());
	}

}

package com.imancha.game;

/**
 * @author Imancha
 * 
 */
public class PemanahTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pemanah arjuna = new Pemanah("Arjuna");
		System.out.println("Hello, nama saya " + arjuna.getNama());
		System.out.println("Darah : " + arjuna.getDarah());
		System.out.println("Daya Hancur : " + arjuna.getDayaHancur());
		System.out.println("Banyak Panah : " + arjuna.getBanyakPanah());
		System.out.println("-------------------");

		Karakter lawan = new Karakter("Lawan");
		arjuna.terkenaMusuh(lawan);
		arjuna.memanah();
		lawan.terkenaMusuh(arjuna);
		System.out.println("Darah Arjuna : " + arjuna.getDarah());
		System.out.println("Darah lawan  : " + lawan.getDarah());
		System.out.println("Panah Arjuna : " + arjuna.getBanyakPanah());
		arjuna.tambahPanah(100);
		System.out.println("Panah Arjuna : " + arjuna.getBanyakPanah());
	}

}

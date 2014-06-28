package com.imancha.game;

/**
 * @author Imancha
 * 
 */
public class PenembakTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Penembak sniper = new Penembak("Sniper");
		System.out.println("Hello, nama saya " + sniper.getNama());
		System.out.println("Darah : " + sniper.getDarah());
		System.out.println("Daya Hancur : " + sniper.getDayaHancur());
		System.out.println("Banyak Peluru : " + sniper.getBanyakPeluru());
		System.out.println("-----------------");

		Karakter lawan = new Karakter("Lawan");
		sniper.terkenaMusuh(lawan);
		sniper.menembak();
		lawan.terkenaMusuh(sniper);
		System.out.println("Darah Sniper : " + sniper.getDarah());
		System.out.println("Darah Lawan  : " + lawan.getDarah());
		System.out.println("Peluru Sniper : " + sniper.getBanyakPeluru());
		sniper.tambahPeluru(10);
		System.out.println("Peluru Sniper : " + sniper.getBanyakPeluru());
		for (int i = 1; i < 13; i++) {
			sniper.menembak();
			System.out.println("Tembakan ke-" + i + " Peluru : "
					+ sniper.getBanyakPeluru());
		}
	}

}

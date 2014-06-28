package com.imancha.game;

public class AllKarakterTester {

	public static void main(String[] args) {
		Pemanah arjuna = new Pemanah("Arjuna");
		Penembak sniper = new Penembak("Sniper");
		System.out.println("Arjuna : Darah " + arjuna.getDarah());
		System.out.println("Sniper : Darah " + sniper.getDarah());
		System.out.println("- ARJUNA MEMANAH - SNIPER MENEMBAK -");
		sniper.menembak();
		arjuna.terkenaMusuh(sniper);
		arjuna.memanah();
		sniper.terkenaMusuh(arjuna);
		System.out.println("Arjuna : Darah " + arjuna.getDarah());
		System.out.println("Sniper : Darah " + sniper.getDarah());
		System.out.println("- SNIPER DITEMBAK DIRINYA --");
		sniper.terkenaMusuh(sniper);
		System.out.println("Sniper : Darah " + sniper.getDarah());
		System.out.println("- ARJUNA MEMANAH SNIPER SAMPAI PANAH HABIS - ");
		int panah_ke = 0;
		while (arjuna.getBanyakPanah() > 0) {
			panah_ke++;
			arjuna.memanah();
			System.out.println("Panah ke-" + panah_ke + " Darah Sniper "
					+ sniper.getDarah());
			sniper.terkenaMusuh(arjuna);
		}

	}

}

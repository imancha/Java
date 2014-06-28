package com.imancha.game;

/**
 * @author Imancha
 * 
 */
public class KarakterTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Karakter player1 = new Karakter("Player 1");
		Karakter player2 = new Karakter("Player 2", 8);

		System.out.println(player1.getNama() + " : " + player1.getDarah() + "%");
		System.out.println(player2.getNama() + " : " + player2.getDarah() + "%");
		System.out.println("Player 1 terkena Player 2");
		player1.terkenaMusuh(player2);
		System.out.println(player1.getNama() + " : " + player1.getDarah() + "%");
		System.out.println("Player 2 terkena Player 1");
		player2.terkenaMusuh(player1);
		System.out.println(player2.getNama() + " : " + player2.getDarah() + "%");
		System.out.println("Player 1 terkena Player 2 sebanyak 10 kali");
		for (int i = 0; i < 10; i++)
			player1.terkenaMusuh(player2);
		System.out.println(player1.getNama() + " : " + player1.getDarah() + "%");
		System.out.println("Player 1 dapat bonus darah 25");
		player1.tambahDarah(25);
		System.out.println(player1.getNama() + " : " + player1.getDarah() + "%");
		System.out.println("Bunuh Player 1");
		int i = 0;
		while (player1.hidup()) {
			player1.terkenaMusuh(player2);
			i++;
			System.out.println(player1.getNama() + " terkena " + i
					+ " kali, darah " + player1.getDarah() + "%");
		}
	}

}

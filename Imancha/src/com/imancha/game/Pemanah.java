package com.imancha.game;

/**
 * @author Imancha
 * 
 */
public class Pemanah extends Karakter {
	private int banyakPanah;

	public Pemanah(String nama) {
		super(nama, 10);
		this.banyakPanah = 10;
	}

	public Pemanah(String nama, int banyakPanah) {
		super(nama, 10);
		this.banyakPanah = banyakPanah;
	}

	public int getBanyakPanah() {
		return this.banyakPanah;
	}

	public void tambahPanah(int banyakPanah) {
		this.banyakPanah += banyakPanah;
		if (getBanyakPanah() > 20)
			this.banyakPanah = 20;
	}

	private void kurangiPanah(int banyakPanah) {
		this.banyakPanah -= banyakPanah;
		if (getBanyakPanah() < 0)
			this.banyakPanah = 0;
	}

	public void memanah() {
		if (getBanyakPanah() > 0) {
			kurangiPanah(1);
		} else {
			System.out.println("Panah Habis...");
		}
	}

}

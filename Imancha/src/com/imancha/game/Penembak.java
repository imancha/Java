package com.imancha.game;

/**
 * @author Imancha
 * 
 */
public class Penembak extends Karakter {
	private int banyakPeluru;

	public Penembak(String nama) {
		super(nama, 20);
		this.banyakPeluru = 6;
	}

	public Penembak(String nama, int banyakPeluru) {
		super(nama, 20);
		this.banyakPeluru = banyakPeluru;
	}

	public int getBanyakPeluru() {
		return this.banyakPeluru;
	}

	public void tambahPeluru(int banyakPeluru) {
		this.banyakPeluru += banyakPeluru;
		if (getBanyakPeluru() > 6)
			this.banyakPeluru = 6;
	}

	private void kurangiPeluru(int banyakPeluru) {
		this.banyakPeluru -= banyakPeluru;
		if (getBanyakPeluru() < 0)
			this.banyakPeluru = 0;
	}

	public void menembak() {
		if (getBanyakPeluru() == 0){
			System.out.println("Peluru Reloaded...");
			this.banyakPeluru = 6;			
		}
		kurangiPeluru(1);
	}
}

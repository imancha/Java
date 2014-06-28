package com.imancha.uts;
public class Manusia {
	private String nama;
	private int posisiX;
	private int posisiY;

	Manusia(String nama) {
		this.nama = nama;
		this.posisiX = 0;
		this.posisiY = 0;
	}

	Manusia(String nama, int x, int y) {
		this.nama = nama;
		this.posisiX = x;
		this.posisiY = y;
	}

	public void setPosisiX(int x) {
		posisiX = x;
	}

	public int getPosisiX() {
		return posisiX;
	}

	public void setPosisiY(int y) {
		posisiY = y;
	}

	public int getPosisiY() {
		return posisiY;
	}

	public String getNama() {
		return nama;
	}

	public String posisiSekarang() {
		return "<" + posisiX + "," + posisiY + ">";
	}
}

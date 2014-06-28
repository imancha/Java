package com.imancha.game;

/**
 * @author Imancha
 * 
 */
public class Karakter {
	private String nama;
	private int darah;
	private int dayaHancur;

	public Karakter(String nama) {
		this.nama = nama;
		this.darah = 100;
		this.dayaHancur = 1;
	}

	public Karakter(String nama, int dayaHancur) {
		this.nama = nama;
		this.darah = 100;
		this.dayaHancur = dayaHancur;
	}

	public String getNama() {
		return this.nama;
	}

	public int getDarah() {
		return this.darah;
	}

	public int getDayaHancur() {
		return this.dayaHancur;
	}

	public void tambahDarah(int darah) {
		this.darah += darah;
		if (getDarah() > 100)
			this.darah = 100;
	}

	private void kurangiDarah(int darah) {
		this.darah -= darah;
		if (getDarah() < 0)
			this.darah = 0;
	}

	public void terkenaMusuh(Karakter musuh) {
		kurangiDarah(musuh.getDayaHancur());
	}

	public boolean hidup() {
		if (getDarah() > 0)
			return true;
		return false;
	}

	public boolean mati() {
		if (!hidup())
			return true;
		return false;
	}
}

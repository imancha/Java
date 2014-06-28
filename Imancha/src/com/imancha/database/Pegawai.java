package com.imancha.database;

public class Pegawai {
	private String NIP;
	private String Nama;
	private String JenisKelamin;
	private int Tinggi;

	public void setNIP(String nip) {
		NIP = nip;
	}

	public void setNama(String nama) {
		Nama = nama;
	}

	public void setJenisKelamin(String jk) {
		JenisKelamin = jk;
	}

	public void setTinggi(int tinggi) {
		Tinggi = tinggi;
	}

	public String getNIP() {
		return NIP;
	}

	public String getNama() {
		return Nama;
	}

	public String getJenisKelamin() {
		return JenisKelamin;
	}

	public int getTinggi() {
		return Tinggi;
	}

	public Pegawai(String nip, String nama, String jk, int tinggi) {
		setNIP(nip);
		setNama(nama);
		setJenisKelamin(jk);
		setTinggi(tinggi);
	}
}

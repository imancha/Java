package com.imancha.test;
import java.util.Scanner;

public class biayaWarnet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		System.out.print("Jam Masuk    : ");
		byte jamMasuk = in.nextByte();
		System.out.print("Menit Masuk  : ");
		byte menitMasuk = in.nextByte();
		System.out.print("Jam Keluar   : ");
		byte jamKeluar = in.nextByte();
		System.out.print("Menit Keluar : ");
		byte menitKeluar = in.nextByte();

		int detikJamMasuk = jamMasuk * 3600;
		int detikMenitMasuk = menitMasuk * 60;
		int detikJamKeluar = jamKeluar * 3600;
		int detikMenitKeluar = menitKeluar * 60;
		int detikMasuk = detikJamMasuk + detikMenitMasuk;
		int detikKeluar = detikJamKeluar + detikMenitKeluar;
		int detik = detikKeluar - detikMasuk;
		int jam = detik / 3600;
		int sisaJam = detik % 3600;
		int menit = sisaJam / 60;
		double totalJam = (double) detik / 3600;
		double biaya = totalJam * 5000;

		System.out.printf("\nLama Rental adalah " + Math.abs(jam) + " jam " + Math.abs(menit)
				+ " menit (%.2f jam) dengan biaya Rp. %,.0f", Math.abs(totalJam), Math.abs(biaya));
	}

}

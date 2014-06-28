package com.imancha.test;

import java.text.NumberFormat;

public class array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nilai[] = new int[3];
		nilai[0] = 70;
		nilai[1] = 80;
		nilai[2] = 65;

		double rata = 0.0;

		for (int i = 0; i < nilai.length; i++) {
			rata += nilai[i];
		}

		rata /= nilai.length;

		System.out.println("Nilai rata-rata = " + rata);

		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(3);

		int nilai1[][] = new int[2][3];
		nilai1[0][0] = 85;
		nilai1[0][1] = 81;
		nilai1[0][2] = 78;
		nilai1[1][0] = 65;
		nilai1[1][1] = 73;
		nilai1[1][2] = 71;

		String MK[] = { "RPL", "PBO" };
		double rataMK[] = new double[nilai1.length];

		for (int i = 0; i < nilai1.length; i++) {
			for (int j = 0; j < nilai1[0].length; j++) {
				rataMK[i] += nilai1[i][j];
			}
			rataMK[i] /= nilai1[0].length;
		}

		System.out.println("\nNilai Mata Kuliah");
		System.out.println("MK\tMinggu1\tMinggu2\tMinggu3\tRata-Rata");

		for (int i = 0; i < nilai1.length; i++) {
			System.out.print(MK[i] + "\t");
			for (int j = 0; j < nilai1[0].length; j++) {
				System.out.print(nilai1[i][j] + "\t");
			}
			System.out.print(nf.format(rataMK[i]) + "\n");
		}
	}

}

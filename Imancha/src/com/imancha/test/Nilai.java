package com.imancha.test;
import java.util.Scanner;

/**
 * @author Imancha
 * 
 */
public class Nilai {
	Scanner in = new Scanner(System.in);
	private double Quis;
	private double UTS;
	private double UAS;

	public void setQuis() {
		System.out.print("Quis : ");
		double x = in.nextDouble();

		if (x >= 0 && x <= 100)
			this.Quis = x;
	}

	public double getQuis() {
		return Quis;
	}

	public void setUTS() {
		System.out.print("UTS  : ");
		double x = in.nextDouble();

		if (x >= 0 && x <= 100)
			this.UTS = x;
	}

	public double getUTS() {
		return UTS;
	}

	public void setUAS() {
		System.out.print("UAS  : ");
		double x = in.nextDouble();

		if (x >= 0 && x <= 100)
			this.UAS = x;
	}

	public double getUAS() {
		return UAS;
	}

	public double getNA() {
		return (20 * Quis / 100) + (30 * UTS / 100) + (50 * UAS / 100);
	}

	public char getIndex() {
		char index = 0;

		if (getNA() < 101 && getNA() > 79)
			index = 'A';
		else if (getNA() < 80 && getNA() > 67)
			index = 'B';
		else if (getNA() < 68 && getNA() > 55)
			index = 'C';
		else if (getNA() < 56 && getNA() > 44)
			index = 'D';
		else
			index = 'E';

		return index;
	}

	public String getKeterangan() {
		String keterangan = new String();

		switch (getIndex()) {
			case 'A':
				keterangan = "Sangat Baik";
				break;
			case 'B':
				keterangan = "Baik";
				break;
			case 'C':
				keterangan = "Cukup";
				break;
			case 'D':
				keterangan = "Kurang";
				break;
			default:
				keterangan = "Sangat Kurang";
		}

		return keterangan;
	}
}

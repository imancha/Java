package com.imancha.test;
import java.util.Scanner;


public class hitungGaji {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		System.out.print("Gaji Pokok         : ");
		double gajiPokok = in.nextDouble();
		System.out.print("Banyak Anak        : ");
		byte anak = in.nextByte();
				
		double tunjKeluarga = 0.2 * gajiPokok;
		double tunjAnak = 0.05 * gajiPokok * anak;
		double gajiKotor = gajiPokok + tunjKeluarga + tunjAnak;
		double pajak = 0.15 * gajiKotor;
		double gajiBersih = gajiKotor - pajak;
		
		System.out.printf("Tunjangan Keluarga : Rp. %,10.0f\n",tunjKeluarga);
		System.out.printf("Tunjangan Anak     : Rp. %,10.0f\n",tunjAnak);
		System.out.printf("Gaji Kotor         : Rp. %,10.0f\n",gajiKotor);
		System.out.printf("Pajak (15%%)        : Rp. %,10.0f\n",pajak);
		System.out.printf("Gaji Bersih        : Rp. %,10.0f\n",gajiBersih);
	}

}

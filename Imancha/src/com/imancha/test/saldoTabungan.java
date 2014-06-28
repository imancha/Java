package com.imancha.test;
import java.util.Scanner;


public class saldoTabungan {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.print("Saldo Awal      : ");
		double saldoAwal = in.nextDouble();
		System.out.print("Bunga/Bulan (%) : ");
		double bunga = in.nextDouble();
		System.out.print("Lama (bulan)    : ");
		byte lama = in.nextByte();
		
		for(int i=1; i<=lama; i++){
			saldoAwal += saldoAwal * bunga / 100;
			System.out.printf("Saldo di bulan ke-%2d : Rp. %,10.0f\n",i,saldoAwal);
		}
	}

}

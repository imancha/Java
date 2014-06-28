package com.imancha.stack;

/**
 * @author imancha
 * 
 */
public class MyStackArrayTester {
	public static void main(String[] args) {
		MyStackArray msa = new MyStackArray(5);

		System.out.println("Kosong : " + msa.kosong());
		System.out.println("Penuh  : " + msa.penuh());
		System.out.println("Banyak : " + msa.banyak());

		msa.push(999);
		msa.push(888);
		msa.push(777);
		msa.push(666);
		msa.push(555);
		msa.push(444);

		System.out.println("Stack  : " + msa.toString());
		System.out.println("Top    : " + msa.teratas());

		msa.pop();

		System.out.println("Stack  : " + msa.toString());
		System.out.println("Top    : " + msa.teratas());

		msa.pop();

		System.out.println("Stack  : " + msa.toString());
		System.out.println("Top    : " + msa.teratas());

		msa.push(333);
		msa.push(222);

		System.out.println("Stack  : " + msa.toString());
		System.out.println("Top    : " + msa.teratas());

		System.out.println("--> Balik Urutan ");
		msa.balikurutan();

		System.out.println("Stack  : " + msa.toString());
		System.out.println("Top    : " + msa.teratas());

		System.out.println("Kosong : " + msa.kosong());
		System.out.println("Penuh  : " + msa.penuh());
		System.out.println("Banyak : " + msa.banyak());
	}
}

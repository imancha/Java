package com.imancha.stack;

/**
 * @author imancha
 * 
 */
public class MyStackLinkedListTester {
	public static void main(String[] args) {
		MyStackLinkedList msl = new MyStackLinkedList();

		System.out.println("Kosong : " + msl.kosong());

		msl.push(111);
		msl.push(222);
		msl.push(333);

		System.out.print("Stack  : ");
		msl.toString();
		System.out.println("Top    : " + msl.teratas());

		msl.pop();

		System.out.print("Stack  : ");
		msl.toString();
		System.out.println("Top    : " + msl.teratas());

		msl.push(444);
		msl.push(555);
		msl.push(666);

		System.out.print("Stack  : ");
		msl.toString();
		System.out.println("Top    : " + msl.teratas());

		System.out.println("--> Balik Urutan");
		msl.balikurutan();
		System.out.print("Stack  : ");
		msl.toString();

		System.out.println("Kosong : " + msl.kosong());
		System.out.println("Banyak : " + msl.banyak());
	}

}

package com.imancha.stack;

import java.util.Arrays;

/**
 * @author imancha
 * 
 */
public class MyStackArray {
	private int[] stack;
	private int top;

	/**
	 * Konstruktor dengan parameter maks yang bertipe integer dari stack array.
	 * Parameter maks akan digunakan sebagai banyaknya array yang dibutuhkan.
	 * Method ini juga digunakan untuk inisialisasi dari stack yang akan
	 * digunakan, dimana pointer yang akan digunakan diisi dengan nilai -1. Suatu
	 * stack memiliki sebuah pointer yang menunjuk posisi data terakhir (top).
	 * 
	 * @param maks
	 *           Nilai untuk banyaknya array.
	 */
	public MyStackArray(int maks) {
		this.stack = new int[maks];
		this.top = -1;
	}

	/**
	 * Method untuk menambahkan sebuah data baru bertipe integer kedalam stack.
	 * Data yang ditambahkan nantinya akan berada pada urutan atau posisi paling
	 * atas dari stack. Langkah operasi push dalam array yaitu stack dapat
	 * ditambah jika stack belum penuh dan proses push-nya sendiri adalah dengan
	 * menambah field top dengan 1, kemudian elemen pada posisi top diisi dengan
	 * elemen data baru.
	 * 
	 * @param x
	 *           Data yang akan ditambahkan pada stack.
	 */
	public void push(int x) {
		if (!penuh()) {
			top++;
			stack[top] = x;
			System.out.println("--> Push(" + stack[top] + ") berhasil");
		} else {
			System.out.println("--> Push(" + x + ") gagal, stack penuh");
		}
	}

	/**
	 * Method untuk mengambil sebuah data yang berada pada stack. Data yang
	 * diambil merupakan data yang berada pada urutan atau posisi paling atas
	 * dari stack. Setelah data paling atas dari stack diambil dan dihapus, maka
	 * data yang berada pada urutan atau posisi dibawahnya akan menjadi data yang
	 * berada pada urutan atau posisi paling atas. Stack dapat mengeluarkan
	 * elemennya jika stack tidak kosong.
	 * 
	 * @return Data paling atas stack.
	 */
	public int pop() {
		if (!kosong()) {
			int x = stack[top];
			stack[top] = 0;
			top--;

			System.out.println("--> Pop(" + x + ") berhasil");

			return x;
		} else {
			System.out.println("--> Pop gagal, stack kosong");
		}

		return 0;
	}

	/**
	 * Method untuk menampilkan seluruh isi atau data yang berada pada stack. Isi
	 * dari stack akan ditampilkan dalam bentuk array.
	 */
	public String toString() {
		return Arrays.toString(stack);
	}

	/**
	 * Method untuk memeriksa apakah stack sudah penuh atau belum. Stack disebut
	 * penuh apabila elemen teratas dari stack berada pada posisi atau indeks
	 * sama dengan banyaknya array-1 yang sudah dipesan pada saat inisialisasi
	 * (maks).
	 * 
	 * @return True jika penuh dan False jika sebaliknya.
	 */
	public boolean penuh() {
		return (top == stack.length - 1);
	}

	/**
	 * Method untuk memeriksa apakah stack masih kosong atau sudah mempunyai isi.
	 * Stack disebut kosong apabila elemen teratas dari stack masih berada pada
	 * posisi -1 (inisialisasi).
	 * 
	 * @return True jika kosong dan False jika sebaliknya.
	 */
	public boolean kosong() {
		return (top == -1);
	}

	/**
	 * Method untuk mengambil sebuah data yang berada dalam stack. Data yang
	 * diambil merupakan data yang berada pada posisi paling atas dari stack.
	 * Setelah data paling atas dari stack diambil, maka posisi teratas dari
	 * stack tidak berubah. Method ini hampir mirip dengan method pop.
	 * 
	 * @see #pop()
	 * @return Data paling atas stack.
	 */
	public int teratas() {
		try {
			return stack[top];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("--> Stack Kosong");
		}
		return 0;
	}

	/**
	 * Method untuk membalikkan urutan data yang berada pada stack. Data yang
	 * berada pada posisi paling atas dari stack akan berubah menjadi data yang
	 * berada pada posisi paling bawah dari stack. Begitu juga dengan sebaliknya.
	 */
	public void balikurutan() {
		if (!kosong()) {
			int[] temp = new int[stack.length];

			for (int i = 0; i <= top; i++) {
				temp[i] = stack[top - i];
			}

			stack = temp;
		} else {
			System.out.println("--> Stack Kosong");
		}
	}

	/**
	 * Method untuk mengetahui banyaknya elemen atau data yang telah diisi pada
	 * stack.
	 * 
	 * @return Banyaknya data pada stack.
	 */
	public int banyak() {
		int n = 0;
		for (int i = 0; i < stack.length; i++) {
			if (stack[i] != 0)
				n++;
		}
		return n;
	}
}

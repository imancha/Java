package com.imancha.stack;

/**
 * @author imancha
 * 
 */
public class MyStackLinkedList {
	/**
	 * Pendeklarasian stack yang menggunakan linked list. Stack yang menggunakan
	 * single linked list hanya memerlukan suatu pointer yang menunjuk ke data
	 * terakhir. Setiap elemen linked list mempunyai dua buah field yaitu medan
	 * data (info) dan pointer sambung (next).
	 * 
	 */
	private class List {
		private int info;
		private List next;

		public List(int x) {
			this.info = x;
			this.next = null;
		}
	}

	private List top;

	/**
	 * Konstruktor tanpa parameter dari stack linked list. Method ini juga
	 * digunakan sebagai inisialisasi dari stack yang akan digunakan, dimana
	 * pointer yang akan digunakan diisi dengan nilai null.
	 */
	public MyStackLinkedList() {
		this.top = null;
	}

	/**
	 * Method untuk menambahkan sebuah data baru bertipe integer pada stack. Data
	 * yang akan ditambahkan nantinya akan berada pada urutan atau posisi paling
	 * atas dari stack. Operasi push pada stack yang menggunakan linked list
	 * yaitu sama dengan proses sisip depan pada operasi linked list. Proses
	 * push-nya sendiri adalah dengan cara mengalokasikan suatu elemen linked
	 * list dan memeriksa apakah stack kosong atau tidak.
	 * 
	 * @param x
	 *           Data yang akan ditambahkan pada stack.
	 */
	public void push(int x) {
		List baru = new List(x);

		if (kosong()) {
			top = baru;
		} else {
			baru.next = top;
			top = baru;
		}

		System.out.println("--> Push(" + x + ") berhasil");
	}

	/**
	 * Method untuk mengambil sebuah data yang berada pada stack. Operasi pop
	 * pada linked list adalah sama dengan proses hapus depan pada operasi linked
	 * list. Data yang diambil merupakan data yang berada pada urutan atau posisi
	 * paling atas dari stack. Setelah data paling atas dari stack diambil dan
	 * dihapus, maka data yang berada pada urutan atau posisi dibawahnya akan
	 * menjadi data yang berada pada urutan atau posisi paling atas. Stack dapat
	 * mengeluarkan elemennya jika stack tidak kosong.
	 * 
	 * @return Data paling atas stack.
	 */
	public int pop() {
		if (!kosong()) {
			List temp = top;
			top = top.next;
			temp.next = null;

			System.out.println("--> Pop(" + temp.info + ") berhasil");

			return temp.info;
		} else {
			System.out.println("--> Pop gagal, Stack kosong");
		}
		return 0;
	}

	/**
	 * Method untuk menampilkan seluruh isi atau data yang berada pada stack.
	 */
	public String toString() {
		List list = top;
		while (list != null) {
			System.out.print(list.info + " ");
			list = list.next;
		}
		System.out.println();
		return null;
	}

	/**
	 * Method untuk memeriksa apakah stack masih kosong atau sudah mempunyai isi.
	 * Stack disebut kosong apabila elemen teratas dari stack masih bernilai null
	 * (inisialisasi).
	 * 
	 * @return True jika kosong dan False jika sebaliknya.
	 */
	public boolean kosong() {
		return (top == null);
	}

	/**
	 * Method untuk mengambil sebuah data yang berada dalam stack. Data yang
	 * diamibil merupakan data yang berada pada posisi paling atas dari stack.
	 * Setelah data paling atas dari stack diambil, maka posisi teratas dari
	 * stack tidak berubah. Method ini hampir mirip dengan method pop().
	 * 
	 * @see #pop()
	 * @return Data paling atas stack.
	 */
	public int teratas() {
		if (!kosong())
			return top.info;
		else
			System.out.println("Stack kosong");

		return 0;
	}

	/**
	 * Method untuk membalikkan urutan data yang berada pada stack. Data yang
	 * berada pada posisi paling atas dari stack akan berubah menjadi data yang
	 * berada pada posisi paling bawah dari stack. Begitu juga dengan sebaliknya.
	 */
	public void balikurutan() {
		if (!kosong()) {
			List temp = null;

			while (!kosong()) {
				List baru = new List(top.info);

				if (kosong()) {
					temp = baru;
				} else {
					baru.next = temp;
					temp = baru;
				}

				top = top.next;
			}

			top = temp;
		} else {
			System.out.println("Stack Kosong");
		}
	}

	/**
	 * Method untuk mengetahui banyaknya elemen atau data yang telah diisi pada
	 * stack.
	 * 
	 * @return Banyaknya data pada stack.
	 */
	public int banyak() {
		int banyak = 0;
		List list = top;
		while (list != null) {
			++banyak;
			list = list.next;
		}
		return banyak;
	}
}

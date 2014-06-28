package com.imancha.queue;

/**
 * @author imancha
 * 
 */
public class MyQueueLinkedList {
	/**
	 * Pendeklarasian queue yang menggunakan linked list. Queue yang menggunakan
	 * linked list memerlukan sebuah pointer yang menunjuk ke data pertama dan
	 * sebuah pointer yang menunjuk ke data terakhir. Setiap elemen linked list
	 * mempunyai dua buah field yaitu medan data (info) dan pointer sambung
	 * (next).
	 */
	private class List {
		private int info;
		private List next;

		public List(int x) {
			this.info = x;
			this.next = null;
		}
	}

	private List front;
	private List rear;

	/**
	 * Kosntruktor tanpa parameter dari queue linked list. Method ini juga
	 * digunakan sebagai inisialisasi dari queue yang akan digunakan, dimana
	 * pointer yang akan digunakan diisi dengan nilai null.
	 */
	public MyQueueLinkedList() {
		this.front = null;
		this.rear = null;
	}

	/**
	 * Method untuk menambahkan sebuah data baru bertipe integer pada queue.
	 * Proses enqueue dalam enqueue linked list adalah dengan menambahkan sebuah
	 * data baru ke posisi atau urutan paling belakang. Setelah itu, pointer
	 * penunjuk rear harus berpindah ke posisi atau urutan baru tersebut. Proses
	 * ini seperti proses sisip belakang pada linked list.
	 * 
	 * @param x
	 *           Data yang akan ditambahkan.
	 */
	public void enqueue(int x) {
		List baru = new List(x);

		if (kosong())
			front = baru;
		else
			rear.next = baru;

		rear = baru;
		baru.next = null;

		System.out.println("--> Push(" + x + ") berhasil");
	}

	/**
	 * Method untuk mengambil sebuah data yang berada pada queue. Proses dequeue
	 * untuk queue linked list adalah dengan mengambil data yang ditunjuk oleh
	 * pointer front. Pointer front harus berpindah ke elemen antrian berikutnya
	 * apabila sebuah data telah diambil. Proses tersebut dilakukan hanya jika
	 * linked list tidak kosong. Proses ini mirip dengan proses hapus depan pada
	 * linked list.
	 * 
	 * @return Data paling depan queue.
	 */
	public int dequeue() {
		List hapus;
		if (rear != null) {
			hapus = front;
			if (front == rear) {
				front = null;
				rear = null;
			} else {
				front = front.next;
			}

			System.out.println("--> Pop(" + hapus.info + ") berhasil");

			return hapus.info;
		} else {
			System.out.println("--> Pop gagal, Stack kosong");
		}
		return 0;
	}

	/**
	 * Method untuk memeriksa apakah queue masih kosong atau queue sudah
	 * mempunyai isi. Queue disebut kosong apabila pointer penunjuk front
	 * bernilai null.
	 * 
	 * @return True jika kosong dan False jika sebaliknya.
	 */
	public boolean kosong() {
		return (front == null);
	}

	/**
	 * Method untuk menampilkan seluruh isi atau data yang berada pada queue.
	 */
	public String toString() {
		List list = front;
		while (list != null) {
			System.out.print(list.info + " ");
			list = list.next;
		}
		System.out.println();
		return null;
	}

	/**
	 * Method untuk mengambil sebuah data yang berada dalam queue. Data yang
	 * diambil merupakan data yang berada pada posisi paling depan dari queue.
	 * Setelah data paling depan dari queue diambil, maka posisi terdepan dari
	 * queue tidak berubah. Method ini hampir mirip dengan method dequeue. Proses
	 * ini dilakukan hanya jika keadaan queue tidak kosong.
	 * 
	 * @see #dequeue()
	 * @return Data paling depan queue.
	 */
	public int terdepan() {
		if (!kosong())
			return front.info;
		else
			System.out.println("Stack Kosong");

		return 0;
	}
}

package com.imancha.queue;

import java.util.Arrays;

/**
 * @author imancha
 * 
 */
public class MyQueueCircular {
	private int[] queue;
	private int front;
	private int rear;

	/**
	 * Konstruktor dengan parameter maks yang bertipe integer dari queue circular
	 * array. Parameter maks akan digunakan sebagai banyaknya array yang
	 * dibutuhkan. Method ini juga digunakan untuk inisialisasi dari queue yang
	 * akan digunakan. Suatu queue memiliki pointer penunjuk depan (front) dan
	 * pointer penunjuk belakang (rear). Untuk inisialisasi maka pointer penunjuk
	 * depan (front) akan diisi dengan nilai -1 dan pointer penunjuk belakang
	 * (rear) akan diisi dengan nilai -1.
	 * 
	 * @param maks
	 *           Nilai untuk banyaknya array.
	 */
	public MyQueueCircular(int maks) {
		this.queue = new int[maks];
		this.front = -1;
		this.rear = -1;
	}

	/**
	 * Method untuk menambahkan sebuah data bertipe integer kedalam queue. Data
	 * yang ditambahkan nantinya akan berada pada urutan paling depan dari queue.
	 * Proses enqueue ini dilakukan jika kondisi dari queue tidak penuh. Jika
	 * kondisi queue masih kosong maka posisi front dan rear akan bernilai 0.
	 * Ketika nilai rear sama dengan banyaknya queue-1 maka posisi rear akan
	 * bernilai 1. Ketika nilai rear masih lebih kecil dari banyaknya queue-1
	 * maka posisi rear ditambah 1.
	 * 
	 * @param x
	 *           Data yang akan ditambahkan pada queue.
	 */
	public void enqueue(int x) {
		if (kosong()) {
			front = 0;
			rear = 0;
			queue[rear] = x;
			System.out.println("--> Enqueue(" + x + ") berhasil");
		} else {
			if (!penuh()) {
				if (rear == queue.length - 1) {
					rear = 0;
				} else {
					rear++;
				}
				queue[rear] = x;
				System.out.println("--> Enqueue(" + x + ") berhasil");
			} else {
				System.out.println("--> Enqueue(" + x + ") gagal, queue penuh");
			}
		}
	}

	/**
	 * Method untuk mengambil sebuah data yang berada pada queue. Data yang
	 * diambil merupakan data yang berada pada urutan atau posisi paling depan
	 * dari queue. Setelah data paling depan dari queue diambil, maka data yang
	 * berada pada urutan atau posisi dibelakangnya akan menjadi data yang berada
	 * pada urutan atau posisi paling depan. Jika queue hanya memiliki satu data
	 * (front = rear) maka penunjuk front dan rear akan bernilai -1. Jika posisi
	 * front sama dengan banyaknya queue-1 maka posisi front menjadi 0. Selain
	 * itu posisi front ditambah dengan 1.
	 * 
	 * @return Data paling depan queue.
	 */
	public int dequeue() {
		if (!kosong()) {
			int x = queue[front];
			queue[front] = 0;

			if (front == rear) {
				front = -1;
				rear = -1;
			} else {
				if (front == queue.length - 1)
					front = 0;
				else
					front++;
			}
			System.out.println("--> Dequeue(" + x + ") berhasil");
			return x;
		} else {
			System.out.println("--> Dequeue gagal, queue kosong");
		}
		return 0;
	}

	/**
	 * Method untuk menampilkan seluruh isi atau data yang berada pada queue.
	 */
	public String toString() {
		return Arrays.toString(queue);
	}

	/**
	 * Method untuk memeriksa apakah queue sudah penuh atau belum. Queue disebut
	 * penuh apabila pointer penunjuk front berada pada posisi 0 dan pointer
	 * penunjuk rear berada pada posisi sama dengan banyaknya queue-1 atau jika
	 * pointer penunjuk front bernilai sama dengan posisi rear+1.
	 * 
	 * @return True jika penuh dan False jika sebaliknya.
	 */
	public boolean penuh() {
		return ((front == 0 && rear == queue.length - 1) || (front == rear + 1));
	}

	/**
	 * Method untuk memeriksa apakah queue masih kosong atau queue sudah
	 * mempunyai isi. Queue disebut kosong apabila pointer penunjuk front atau
	 * pointer penunjuk rear bernilai -1.
	 * 
	 * @return True jika kosong dan False jika sebaliknya.
	 */
	public boolean kosong() {
		return (front == -1);
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
			return queue[front];
		return 0;
	}
}

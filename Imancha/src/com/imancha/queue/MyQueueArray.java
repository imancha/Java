package com.imancha.queue;

import java.util.Arrays;

/**
 * @author imancha
 * 
 */
public class MyQueueArray {
	private int[] queue;
	private int front;
	private int rear;

	/**
	 * Konstruktor dengan parameter maks yang bertipe integer dari queue array.
	 * Parameter maks akan digunakan sebagai banyaknya array yang dibutuhkan.
	 * Method ini juga digunakan untuk inisialisasi dari queue yang akan
	 * digunakan. Suatu queue memiliki pointer penunjuk depan (front) dan pointer
	 * penunjuk belakang (rear). Untuk inisialisasi maka pointer penunjuk depan
	 * (front) akan diisi dengan nilai -1 dan pointer penunjuk belakang (rear)
	 * akan diisi dengan nilai -1.
	 * 
	 * @param maks
	 *           Nilai untuk banyaknya array.
	 */
	public MyQueueArray(int maks) {
		this.queue = new int[maks];
		this.front = -1;
		this.rear = -1;
	}

	/**
	 * Method untuk menambahkan sebuah data bertipe integer kedalam queue. Data
	 * yang ditambahkan nantinya akan berada pada urutan paling belakang dari
	 * queue. Proses enqueue ini dilakukan jika kondisi dari queue tidak penuh.
	 * Jika kondisi queue masih kosong, maka posisi front dan rear akan bernilai
	 * 0 tetapi jika sudah mempunyai elemen, maka posisi rear akan bertambah 1.
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
				rear++;
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
	 * dari queue. Setelah data paling depan dari queue diambil, maka akan
	 * terjadi pergeseran elemen data seteleh elemen data yang diambil (dari
	 * posisi kedua sampai posisi paling belakang), dan kemudian posisi atau
	 * urutan rear akan berkurang 1 karena ada data yang diambil.
	 * 
	 * @return Data paling depan queue.
	 */
	public int dequeue() {
		if (!kosong()) {
			int x = queue[front];

			for (int i = front; i < rear; i++) {
				queue[i] = queue[i + 1];
			}

			queue[rear] = 0;
			rear--;

			System.out.println("--> Dequeue(" + x + ") berhasil");
			return x;
		} else {
			System.out.println("--> Dequeue gagal, queue kosong");
		}
		return 0;
	}

	/**
	 * Method untuk menampilkan seluruh isi atau data dari queue. Isi dari queue
	 * akan ditampilkan dalam bentuk array.
	 */
	public String toString() {
		return Arrays.toString(queue);
	}

	/**
	 * Method untuk memeriksa apakah queue sudah penuh atau belum. Queue disebut
	 * penuh apabila data paling belakang dari queue berada pada posisi atau
	 * indeks sama dengan banyaknya array-1 yang sudah dipesan pada saat
	 * inisialisasi (maks).
	 * 
	 * @return True jika penuh dan False jika sebaliknya.
	 */
	public boolean penuh() {
		return (rear == queue.length - 1);
	}

	/**
	 * Method untuk memeriksa apakah queue masih kosong atau sudah mempunyai isi.
	 * Queue disebut penuh jika penunjuk rear bernilai -1.
	 * 
	 * @return True jika kosong dan False jika sebaliknya.
	 */
	public boolean kosong() {
		return (rear == -1);
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

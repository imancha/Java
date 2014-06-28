package com.imancha.queue;

/**
 * @author imancha
 * 
 */
public class MyQueueArrayTester {
	public static void main(String[] args) {
		MyQueueArray mqa = new MyQueueArray(5);

		System.out.println("Penuh  : " + mqa.penuh());
		System.out.println("Kosong : " + mqa.kosong());

		mqa.enqueue(111);
		mqa.enqueue(222);
		mqa.enqueue(333);
		mqa.enqueue(444);
		mqa.enqueue(555);
		mqa.enqueue(666);

		System.out.println("Queue  : " + mqa.toString());
		System.out.println("Depan  : " + mqa.terdepan());

		mqa.dequeue();

		System.out.println("Queue  : " + mqa.toString());
		System.out.println("Depan  : " + mqa.terdepan());

		mqa.dequeue();

		System.out.println("Queue  : " + mqa.toString());
		System.out.println("Depan  : " + mqa.terdepan());

		mqa.enqueue(777);
		mqa.enqueue(888);

		System.out.println("Queue  : " + mqa.toString());
		System.out.println("Depan  : " + mqa.terdepan());

		System.out.println("Penuh  : " + mqa.penuh());
		System.out.println("Kosong : " + mqa.kosong());
	}

}

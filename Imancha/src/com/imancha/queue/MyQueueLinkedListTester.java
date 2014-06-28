package com.imancha.queue;

/**
 * @author imancha
 * 
 */
public class MyQueueLinkedListTester {
	public static void main(String[] args) {
		MyQueueLinkedList mql = new MyQueueLinkedList();

		System.out.println("Kosong : " + mql.kosong());

		mql.enqueue(111);
		mql.enqueue(222);
		mql.enqueue(333);

		System.out.print("Stack  : ");
		mql.toString();
		System.out.println("Depan  : " + mql.terdepan());

		mql.dequeue();

		System.out.print("Stack  : ");
		mql.toString();
		System.out.println("Depan  : " + mql.terdepan());

		mql.enqueue(444);
		mql.enqueue(555);

		System.out.print("Stack  : ");
		mql.toString();
		System.out.println("Depan  : " + mql.terdepan());

		System.out.println("Kosong : " + mql.kosong());
	}
}

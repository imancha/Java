package com.imancha.queue;

/**
 * @author imancha
 * 
 */
public class MyQueueCircularTester {
	public static void main(String[] args) {
		MyQueueCircular mqc = new MyQueueCircular(5);
		
		System.out.println("Penuh  : " + mqc.penuh());
		System.out.println("Kosong : " + mqc.kosong());

		mqc.enqueue(555);
		mqc.enqueue(666);
		mqc.enqueue(777);
		mqc.enqueue(888);
		mqc.enqueue(999);
		mqc.enqueue(111);

		System.out.println("Queue : " + mqc.toString());
		System.out.println("Depan : " + mqc.terdepan());

		mqc.dequeue();

		System.out.println("Queue : " + mqc.toString());
		System.out.println("Depan : " + mqc.terdepan());

		mqc.enqueue(111);

		System.out.println("Queue : " + mqc.toString());
		System.out.println("Depan : " + mqc.terdepan());

		mqc.dequeue();

		System.out.println("Queue : " + mqc.toString());
		System.out.println("Depan : " + mqc.terdepan());

		mqc.enqueue(333);

		System.out.println("Queue : " + mqc.toString());
		System.out.println("Depan : " + mqc.terdepan());

		System.out.println("Penuh  : " + mqc.penuh());
		System.out.println("Kosong : " + mqc.kosong());
	}

}

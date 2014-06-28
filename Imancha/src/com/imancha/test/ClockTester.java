package com.imancha.test;

/**
 * @author Imancha
 *
 */
public class ClockTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Clock myClock = new Clock();
		
		System.out.println("(1) Total Minutes : "+myClock.getTotalMinutes());
		myClock.setHours(10);
		System.out.println("(2) Total Minutes : "+myClock.getTotalMinutes());
		myClock.setMinutes(57);
		System.out.println("(3) Total Minutes : "+myClock.getTotalMinutes());
		myClock.printTime();
		myClock.incrementTime(20, 2);
		System.out.println("(4) Hours : "+myClock.getHours()+" Minutes : "+myClock.getMinutes());
		myClock.incrementMinutes(40);
		System.out.println("(5) Hours : "+myClock.getHours()+" Minutes : "+myClock.getMinutes());
	}

}

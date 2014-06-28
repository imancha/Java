package com.imancha.test;
/**
 * @author Imancha
 * 
 */
public class Clock {
	private int minutes;

	Clock() {
		minutes = 0;
	}

	public int getMinutes() {
		return minutes % 60;
	}

	public int getHours() {
		return minutes / 60;
	}

	public int getTotalMinutes() {
		return minutes;
	}

	public void setMinutes(int i) {
		if (0 <= i && i < 59)
			minutes += i;
	}

	public void setHours(int i) {
		if (0 <= i && i < 24)
			minutes += i * 60;
	}

	public void incrementMinutes(int i) {
		if (0 <= i && i <= 59)
			minutes += i;
	}

	public void incrementHours(int i) {
		if (0 <= i && i <= 23) {
			minutes += i * 60;
			if (getHours() > 23) {
				minutes -= 24 * 60;
			}
		}
	}

	public void incrementTime(int i, int j) {
		if ((0 <= i && i <= 23) && (0 <= j && j <= 59)) {
			minutes += i * 60 + j;
			if (getHours() > 23) {
				minutes -= 24 * 60;
			}
		}
	}

	public void printTime() {
		System.out.println("    Time : " + getHours() + " : " + getMinutes());
	}

}

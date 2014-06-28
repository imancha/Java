package com.imancha.generic;

public class Penukaran<T> {
	private T v1;
	private T v2;

	public Penukaran(T var1, T var2) {
		v1 = var1;
		v2 = var2;
	}

	public void tukarkan() {
		T temp = v1;
		v1 = v2;
		v2 = temp;
	}

	public T getV1() {
		return v1;
	}

	public T getV2() {
		return v2;
	}
}

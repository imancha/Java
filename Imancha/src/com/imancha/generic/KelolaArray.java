package com.imancha.generic;

public class KelolaArray {
	public static <E> void cetakArray(E[] data) {
		for (E isi : data)
			System.out.print(isi + " ");
		System.out.println();
	}
}

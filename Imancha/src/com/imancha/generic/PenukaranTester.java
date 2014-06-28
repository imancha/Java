package com.imancha.generic;

public class PenukaranTester {

	public static void main(String[] args) {
		// Tipe Data harus kelas atau object
		Integer i1 = 50, i2 = 80;
		Double d1 = 55.5, d2 = 70.2;
		System.out.println("I1 : " + i1 + ", I2 : " + i2);
		System.out.println("D1 : " + d1 + ", D2 : " + d2);
		Penukaran<Integer> t1 = new Penukaran<Integer>(i1, i2);
		Penukaran<Double> t2 = new Penukaran<Double>(d1, d2);
		t1.tukarkan();
		i1 = t1.getV1();
		i2 = t1.getV2();
		System.out.println("I1 : " + i1 + ", I2 : " + i2);
		t2.tukarkan();
		d1 = t2.getV1();
		d2 = t2.getV2();
		System.out.println("D1 : " + d1 + ", D2 : " + d2);
	}
}

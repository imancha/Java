package com.imancha.test;
public class Calculator {

	double Operan1;
	double Operan2;

	public void IsiOperan1(double x) {
		// TODO Auto-generated method stub
		Operan1 = x;
	}

	public void IsiOperan2(double x) {
		// TODO Auto-generated method stub
		Operan2 = x;
	}

	public double Tambah() {
		// TODO Auto-generated method stub
		return Operan1 + Operan2;
	}

	public double Kurang() {
		// TODO Auto-generated method stub
		return Operan1 - Operan2;
	}

	public double Kali() {
		// TODO Auto-generated method stub
		return Operan1 * Operan2;
	}

	public double Bagi() {
		// TODO Auto-generated method stub
		return Operan1 / Operan2;
	}

	public double Pangkat() {
		// TODO Auto-generated method stub
		return Math.pow(Operan1, Operan2);
	}

}

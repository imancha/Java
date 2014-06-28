package com.imancha.uts;
public class OrangIndonesia extends Manusia implements ObjekBergerak {

	OrangIndonesia(String nama) {
		super(nama, BatasIndonesia.maxY, BatasIndonesia.minX);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void maju() {
		// TODO Auto-generated method stub
		int posisi = getPosisiX() + 1;

		if (posisi > BatasIndonesia.maxX)
			System.out.println("Melanggar Batas");
		else
			setPosisiX(posisi);

	}

	@Override
	public void mundur() {
		// TODO Auto-generated method stub
		int posisi = getPosisiX() - 1;

		if (posisi < BatasIndonesia.minX)
			System.out.println("Melanggar Batas");
		else
			setPosisiX(posisi);
	}

	@Override
	public void naik() {
		// TODO Auto-generated method stub
		int posisi = getPosisiY() + 1;

		if (posisi > BatasIndonesia.maxY)
			System.out.println("Melanggar Batas");
		else
			setPosisiY(posisi);
	}

	@Override
	public void turun() {
		// TODO Auto-generated method stub
		int posisi = getPosisiY() - 1;

		if (posisi < BatasIndonesia.minY)
			System.out.println("Melanggar Batas");
		else
			setPosisiY(posisi);
	}

}

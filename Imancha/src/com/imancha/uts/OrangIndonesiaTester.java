package com.imancha.uts;

public class OrangIndonesiaTester {
	static void testBatasIndonesia(){
		System.out.println("Test Class Batas Indonesia");
		System.out.println("--------------------------------");
		System.out.println("MinX = "+BatasIndonesia.minX); // harus 0
		System.out.println("MaxX = "+BatasIndonesia.maxX); // harus 10
		System.out.println("MinY = "+BatasIndonesia.minY); // harus -5
		System.out.println("MaxY = "+BatasIndonesia.maxY); // harus 5
		System.out.println("--------------------------------");
	}
	static void testManusia(){
		System.out.println("Test Class Manusia");
		System.out.println("--------------------------------");
		Manusia m=new Manusia("Acep");
		m.setPosisiX(100);
		m.setPosisiY(-50);
		System.out.println("Nama Saya : "+m.getNama());// Acep
		System.out.println("Sekarang saya di posisi "+m.posisiSekarang()); // 100,-50
		System.out.println("--------------------------------");
	}
	
	static void testOrangIndonesia(){
		System.out.println("Test Class Orang Indonesia");
		OrangIndonesia kabayan,iteung;
		kabayan=new OrangIndonesia("Kabayan");
		iteung=new OrangIndonesia("Iteung");
		System.out.println("Nama Saya : "+kabayan.getNama());
		System.out.println("Nama Saya : "+iteung.getNama());
		System.out.println("Kabayan berada di "+kabayan.posisiSekarang()); // harus 5,0
		System.out.println("Iteung berada di "+iteung.posisiSekarang()); // harus 5,0
		System.out.println("---- TEST SET POSISI ----");
		kabayan.setPosisiX(10);// boleh
		System.out.println("Kabayan berada di "+kabayan.posisiSekarang()); // harus 10,0
		kabayan.maju(); // Harus tidak bisa "Melanggar batas"
		kabayan.naik(); // bisa, posisi Y bertambah
		System.out.println("Kabayan berada di "+kabayan.posisiSekarang()); // harus 10,1
		kabayan.naik(); // bisa, posisi Y bertambah
		System.out.println("Kabayan berada di "+kabayan.posisiSekarang()); // harus 10,2
		
		System.out.println("--------------------------------");
	}
	
	public static void main(String[] args) {
		// Awal test Class Batas
		testBatasIndonesia(); // hilangkan 
		// Akhir test Class Batas

		// Awal test Class Manusia
		testManusia();
		// Akhir test Class Manusia
		
		// Awal test Orang Indonesia
		testOrangIndonesia();
		// Akhir test Orang Indonesia
	}

}

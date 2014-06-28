package com.imancha.test;
/**
 * @author Imancha
 *
 */
public class NilaiTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		
		Nilai n = new Nilai();
		
		n.setQuis();
		n.setUTS();
		n.setUAS();
		
		System.out.println("\nQuis       = "+n.getQuis());
		System.out.println("UTS        = "+n.getUTS());
		System.out.println("UAS        = "+n.getUAS());
		System.out.println("NA         = "+n.getNA());
		System.out.println("Index      = "+n.getIndex());
		System.out.println("Keterangan = "+n.getKeterangan());
	}

}

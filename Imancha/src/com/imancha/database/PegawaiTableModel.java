package com.imancha.database;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

@SuppressWarnings("serial")
public class PegawaiTableModel extends AbstractTableModel {
	private ArrayList<Pegawai> data;
	private String[] namaField = { "NIP", "Nama", "Jenis Kelamin", "Tinggi" };

	public void setData(ArrayList<Pegawai> data) {
		this.data = data;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return namaField.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return data.size();
	}

	@Override
	public Object getValueAt(int baris, int kolom) {
		// TODO Auto-generated method stub
		Pegawai p = data.get(baris); // ambil data pada baris ke-baris
		switch (kolom) {
		case 0:
			return p.getNIP();// returnkan nip
		case 1:
			return p.getNama();// returnkan nama
		case 2:
			return p.getJenisKelamin();// returnkan jk
		case 3:
			return p.getTinggi();// returnkan tinggi
		default:
			return null;// kolom salah, returnkan null
		}
	}

	@Override
	public String getColumnName(int arg0) {
		// TODO Auto-generated method stub
		return namaField[arg0];
	}
}

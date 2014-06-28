package com.imancha.database;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

@SuppressWarnings("serial")
public class MainApp extends JFrame {
	public JPanel pjudul, pmenu;
	public JScrollPane pdata;
	public JLabel judulapp;
	public JButton tblTambah, tblEdit, tblHapus, tblRefresh, tblFilter;
	public JTable tabeldata;
	public Database db;
	public PegawaiTableModel tabelpegawai;
	public FTambahPegawai formtambah;
	public FEditPegawai formedit;

	public void refreshData() {
		tabelpegawai.setData(db.select_seluruh_pegawai());
		tabelpegawai.fireTableDataChanged();
	}

	public MainApp() {
		// inisialialiasi Frame
		super("Aplikasi Pengelolaan Data Pegawai");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 400);
		setLayout(new BorderLayout());
		// Membuat Panel Judul
		pjudul = new JPanel();
		add(pjudul, BorderLayout.NORTH);
		judulapp = new JLabel("Pengolahan Data Pegawai", JLabel.CENTER);
		judulapp.setFont(new Font("Arial", Font.BOLD, 24));
		pjudul.add(judulapp);
		// Membuat Panel Data
		db = new Database(); // buat object database
		tabelpegawai = new PegawaiTableModel();// buat object TabelModel
		tabelpegawai.setData(db.select_seluruh_pegawai());// ambil seluruh data,
															// dan isikan ke
															// tabelmodel

		tabeldata = new JTable(tabelpegawai);
		JScrollPane pdata = new JScrollPane(tabeldata);
		add(pdata, BorderLayout.CENTER);
		// Membuat Panel Menu
		pmenu = new JPanel();
		add(pmenu, BorderLayout.SOUTH);
		pmenu.setLayout(new FlowLayout(FlowLayout.LEFT));
		tblTambah = new JButton("Tambah");
		tblEdit = new JButton("Edit");
		tblHapus = new JButton("Hapus");
		tblRefresh = new JButton("Refresh");
		tblFilter = new JButton("Filter/Pencarian");
		pmenu.add(tblTambah);
		pmenu.add(tblEdit);
		pmenu.add(tblHapus);
		pmenu.add(tblRefresh);
		pmenu.add(tblFilter);

		// Aksi-aksi tombol di Panel Menu
		formtambah = new FTambahPegawai(this);
		tblTambah.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				formtambah.tnip.setText("");
				formtambah.tnama.setText("");
				formtambah.tjk.setText("");
				formtambah.ttinggi.setText("");
				formtambah.setVisible(true);
				refreshData();
			}
		});

		formedit = new FEditPegawai(this);
		tblEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int baris = tabeldata.getSelectedRow();
				String nip = (String) tabelpegawai.getValueAt(baris, 0);
				Pegawai p = db.pilih_1_pegawai(nip);
				if (p != null) {
					formedit.setForm(p);
					formedit.setVisible(true);
					refreshData();
				} else
					JOptionPane.showMessageDialog(null, "Pegawai dengan NIP "
							+ nip + " tidak ditemukan.");
			}
		});
		tblHapus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int baris = tabeldata.getSelectedRow();
				String nip = (String) tabelpegawai.getValueAt(baris, 0);
				String nama = (String) tabelpegawai.getValueAt(baris, 1);
				Object[] pilihan = { "Ya", "Tidak" };
				int jawaban = JOptionPane.showOptionDialog(null,
						"Anda yakin data pegawai dengan NIP " + nip
								+ " dengan nama " + nama + " akan dihapus?",
						"Peringatan", JOptionPane.DEFAULT_OPTION,
						JOptionPane.WARNING_MESSAGE, null, pilihan, pilihan[0]);
				if (jawaban == 0) {
					db.hapus_pegawai(nip);
					refreshData();
				}
			}
		});
		tblRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				refreshData();
			}
		});
		tblFilter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String keyword = JOptionPane.showInputDialog(null, "Keyword:");
				tabelpegawai.setData(db.filter_pegawai(keyword));
				tabelpegawai.fireTableDataChanged();
			}
		});
		setVisible(true);
	}

	public static void main(String[] args) {
		new MainApp();
	}
}

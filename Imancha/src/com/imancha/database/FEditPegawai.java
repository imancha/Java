package com.imancha.database;

import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class FEditPegawai extends JDialog {
	public JLabel lnip, lnama, ljk, ltinggi;
	public JTextField tnip, tnama, tjk, ttinggi;
	public JButton tblsimpan, tblbatal;
	private Database db;

	public FEditPegawai(JFrame parent) {
		super(parent, "Pengeditan Pegawai", true);
		setSize(320, 200);
		setLayout(null);
		lnip = new JLabel("NIP :", JLabel.RIGHT);
		lnip.setBounds(10, 10, 90, 20);
		lnama = new JLabel("Nama :", JLabel.RIGHT);
		lnama.setBounds(10, 40, 90, 20);
		ljk = new JLabel("Kelamin :", JLabel.RIGHT);
		ljk.setBounds(10, 70, 90, 20);
		ltinggi = new JLabel("Tinggi :", JLabel.RIGHT);
		ltinggi.setBounds(10, 100, 90, 20);
		tnip = new JTextField();
		tnip.setBounds(110, 10, 90, 20);
		tnip.setEnabled(false);
		tnama = new JTextField();
		tnama.setBounds(110, 40, 150, 20);
		tjk = new JTextField();
		tjk.setBounds(110, 70, 30, 20);
		ttinggi = new JTextField();
		ttinggi.setBounds(110, 100, 60, 20);
		tblsimpan = new JButton("Simpan");
		tblsimpan.setBounds(110, 130, 80, 20);
		tblbatal = new JButton("Batal");
		tblbatal.setBounds(200, 130, 80, 20);
		add(lnip);
		add(lnama);
		add(ljk);
		add(ltinggi);
		add(tnip);
		add(tnama);
		add(tjk);
		add(ttinggi);
		add(tblsimpan);
		add(tblbatal);
		tblbatal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		tblsimpan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				db = new Database();
				db.update_pegawai(new Pegawai(tnip.getText(), tnama.getText(),
						tjk.getText(), Integer.parseInt(ttinggi.getText())));
				setVisible(false);
			}
		});
	}

	public void setForm(Pegawai p) {
		tnip.setText(p.getNIP());
		tnama.setText(p.getNama());
		tjk.setText(p.getJenisKelamin());
		ttinggi.setText(Double.toString(p.getTinggi()));
	}
}

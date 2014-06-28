package com.imancha.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Template {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("JFrame Title");
		JPanel panelJudul = new JPanel();
		JPanel panelMenu = new JPanel();
		JPanel panelIsi = new JPanel();
		JPanel panelFile = new JPanel();
		JLabel judul = new JLabel("Aplikasi Testing Swing");
		JLabel namafile = new JLabel("<NamaFile>");
		JButton tbl_new = new JButton("New");
		JButton tbl_load = new JButton("Load");
		JButton tbl_save = new JButton("Save");
		JButton tbl_close = new JButton("Close");
		JTextArea textarea = new JTextArea();

		frame.setSize(480, 360);
		frame.setLayout(new BorderLayout(10, 10));

		frame.add(panelJudul, BorderLayout.NORTH);
		frame.add(panelMenu, BorderLayout.WEST);
		frame.add(panelIsi, BorderLayout.CENTER);

		panelJudul.setBackground(Color.red);
		panelMenu.setBackground(Color.green);
		panelIsi.setBackground(Color.blue);

		panelJudul.add(judul);

		judul.setForeground(Color.WHITE);
		judul.setFont(new Font("Arial", Font.BOLD, 24));

		panelMenu.setLayout(new GridLayout(4, 1));

		panelMenu.add(tbl_new);
		panelMenu.add(tbl_load);
		panelMenu.add(tbl_save);
		panelMenu.add(tbl_close);
		
		panelIsi.setLayout(new BorderLayout());
		
		panelIsi.add(textarea,BorderLayout.CENTER);
		panelIsi.add(panelFile,BorderLayout.SOUTH);
		
		panelFile.setLayout(new FlowLayout(FlowLayout.LEFT));
		panelFile.add(new JLabel("Nama File : "));
		panelFile.add(namafile);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

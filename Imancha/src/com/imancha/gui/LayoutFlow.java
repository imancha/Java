package com.imancha.gui;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LayoutFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("JFrame Title");

		frame.setSize(480, 360);
		frame.setLayout(new FlowLayout());

		for (int i = 1; i <= 10; i++) {
			if (i % 5 == 1)// tombol 1 dan 6 dibuat lebih panjang
				frame.add(new JButton("Tombol Panjang " + i));
			else
				frame.add(new JButton("Tombol " + i));
		}

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

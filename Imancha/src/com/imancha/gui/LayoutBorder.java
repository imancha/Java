package com.imancha.gui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class LayoutBorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("JFrame Title");
		JButton button = new JButton("BAWAH");

		button.setBackground(new Color(200, 0, 250));
		button.setForeground(Color.YELLOW);

		frame.setSize(480, 360);
		frame.setLayout(new BorderLayout());

		frame.add(new JButton("ATAS"), BorderLayout.NORTH);
		frame.add(new JButton("KIRI"), BorderLayout.WEST);
		frame.add(new JTextArea("TENGAH"), BorderLayout.CENTER);
		frame.add(new JButton("KANAN"), BorderLayout.EAST);
		frame.add(button, BorderLayout.SOUTH);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

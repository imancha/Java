package com.imancha.gui;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LayoutGrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("JFrame Title");
		JButton button = new JButton("BAWAH");

		button.setBackground(new Color(200, 0, 250));
		button.setForeground(Color.YELLOW);

		frame.setSize(480, 360);

		frame.setLayout(new GridLayout(5, 2, 5, 10));
		for (int i = 1; i <= 10; i++)
			frame.add(new JButton(Integer.toString(i)));

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

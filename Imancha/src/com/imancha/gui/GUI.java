package com.imancha.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("JFrame Title");
		JButton button = new JButton("Button"); 
		JLabel label = new JLabel("Bilangan 1 :");
		JTextField textfield = new JTextField("Text Field");
		
		frame.setSize(480, 360);
		/*	Absolute Layout	*/
		frame.setLayout(null);
		/*	Flow Layout, Bounds tidak berpengaruh	*/
//		frame.setLayout(new FlowLayout(FlowLayout.LEFT,10,5));
		
		label.setBounds(10, 10, 70, 20);
		textfield.setBounds(80, 10, 150, 20);
		button.setBounds(235, 10, 80, 20);
		
		frame.add(label);
		frame.add(textfield);
		frame.add(button);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

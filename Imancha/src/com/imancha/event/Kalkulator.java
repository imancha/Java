package com.imancha.event;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Kalkulator extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton tombolHitung, tombolReset;
	private JLabel l1, l2, l3;
	private JTextField t1, t2, t3;

	public Kalkulator() {
		super("Kalkulator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 190);
		setLayout(null);
		l1 = new JLabel("Bilangan 1");
		l1.setBounds(10, 10, 90, 20);
		l2 = new JLabel("Bilangan 2");
		l2.setBounds(10, 40, 90, 20);
		l3 = new JLabel("Hasil ");
		l3.setBounds(10, 70, 90, 20);
		t1 = new JTextField();
		t1.setBounds(100, 10, 170, 20);
		t2 = new JTextField();
		t2.setBounds(100, 40, 170, 20);
		t3 = new JTextField();
		t3.setBounds(100, 70, 170, 20);
		tombolHitung = new JButton("Hitung");
		tombolHitung.setBounds(100, 100, 80, 20);
		tombolReset = new JButton("Reset");
		tombolReset.setBounds(190, 100, 80, 20);
		add(l1);
		add(l2);
		add(l3);
		add(t1);
		add(t2);
		add(t3);
		add(tombolHitung);
		add(tombolReset);
		t3.setEditable(false);
		t3.setBackground(Color.white);
		tombolHitung.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double b1 = Double.parseDouble(t1.getText());
				double b2 = Double.parseDouble(t2.getText());
				double b3 = b1 * b2;
				t3.setText(Double.toString(b3));
			}
		});
		tombolReset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t1.requestFocus();
			}
		});
		t1.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				if (e.getKeyChar() >= 'A' && 'Z' >= e.getKeyChar()) {
					JOptionPane.showMessageDialog(null, "Harus Angka");
				}
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if (e.getKeyChar() == KeyEvent.VK_ESCAPE)
					System.exit(0);
			}
		});
		setVisible(true);
	}

	public static void main(String[] args) {
		new Kalkulator();
	}
}

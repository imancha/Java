package com.imancha.event;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class DemoEvent extends JFrame implements MouseListener, WindowListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DemoEvent() {
		super("Demo Event");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		addMouseListener(this);
		setVisible(true);
	}

	public static void main(String[] args) {
		new DemoEvent();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

		System.out.print("Mouse di klik pada ");

		if (e.getButton() == MouseEvent.BUTTON1)
			System.out.println("Tombol Kiri");
		else if (e.getButton() == MouseEvent.BUTTON2)
			System.out.println("Tombol Tengah");
		else
			System.out.println("Tombol Kanan");

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Mouse masuk ke Frame di posisi (" + e.getX() + ","
				+ e.getY() + ").");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Mouse keluar dari Frame.");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Tombol Mouse di tekan.");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Tombol Mouse di lepas.");
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Selamat Datang");
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Selamat Jalan");
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}
}

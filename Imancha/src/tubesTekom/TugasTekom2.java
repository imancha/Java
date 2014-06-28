package tubesTekom;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Scanner;

import jdk.nashorn.internal.ir.LiteralNode.ArrayLiteralNode;

@SuppressWarnings("serial")
public class TugasTekom2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public TugasTekom2() {
		super("Instruction");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel l1 = new JLabel("Masukan Instruksi");
		l1.setBounds(10, 11, 166, 24);
		contentPane.add(l1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 32, 572, 180);
		contentPane.add(scrollPane);

		final JTextArea instruksi = new JTextArea();
		scrollPane.setViewportView(instruksi);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 255, 572, 144);
		contentPane.add(scrollPane_1);

		final JTextArea hasil = new JTextArea();
		hasil.setEditable(false);
		scrollPane_1.setViewportView(hasil);

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 410, 572, 144);
		contentPane.add(scrollPane_2);

		final JTextArea pesan = new JTextArea();
		pesan.setEditable(false);
		scrollPane_2.setViewportView(pesan);

		JButton btnNewButton = new JButton("RUN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean error = false;
				String input = instruksi.getText();
				Scanner scanner = new Scanner(input);
				ArrayList<String> list = new ArrayList<>();
				ArrayList<String> proses = new ArrayList<>();
				String namaVar = "";
				String namaVar1 = "";

				while (scanner.hasNext()) {
					list.add(scanner.next());
				}

				if (list.get(0).equalsIgnoreCase("BEGIN")) {
					if (list.get(1).equalsIgnoreCase("int")) {
						String kata = list.get(2);
						if (kata.contains("=") && kata.contains(";")) {
							for (int i = 0; i < kata.length(); i++) {
								if (kata.charAt(i) != '=') {
									namaVar += kata.charAt(i);
								} else {
									break;
								}
							}
							if (list.get(3).equalsIgnoreCase("FOR")) {
								if (list.get(4).equalsIgnoreCase("(int")) {
									if (list.get(5).contains("=")
											&& list.get(5).contains(";")) {
										for (int i = 0; i < list.get(5).length(); i++) {
											if (list.get(5).charAt(i) != '=') {
												namaVar1 += list.get(5).charAt(i);
											} else {
												break;
											}
										}
										if (list.get(6).contains(namaVar1)
												&& list.get(6).contains(";")
												&& (list.get(6).contains("<")
														|| list.get(6).contains(">")
														|| list.get(6).contains("<=") || list
														.get(6).contains(">="))) {
											if (list.get(7).equals(namaVar1 + "++)")
													|| list.get(7).equals(namaVar1 + "--)")) {
												if (list.get(8).equals("{")) {
													int i = 9;
													for (i = 9; i < list.size() - 2; i++) {
														proses.add(list.get(i));
													}
													if (list.get(list.size() - 2)
															.equals("}")) {
														if (list.get(list.size() - 1)
																.equalsIgnoreCase("END")) {

														} else {
															error = true;
														}
													} else {
														error = true;
													}
												} else {
													error = true;
												}
											} else {
												error = true;
											}
										} else {
											error = true;
										}
									} else {
										error = true;
									}
								} else {
									error = true;
								}
							} else {
								error = true;
							}
						} else {
							error = true;
						}
					} else {
						error = true;
					}
				} else {
					error = true;
				}

				if (!error) {
					hasil.append(proses.toString());
				} else {
					hasil.append("salah");
				}

				scanner.close();
			}
		});
		btnNewButton.setBounds(393, 220, 89, 24);
		contentPane.add(btnNewButton);

		JButton button = new JButton("RESET");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				instruksi.requestFocus();
				hasil.setText(null);
				pesan.setText(null);
			}
		});
		button.setBounds(493, 220, 89, 24);
		contentPane.add(button);

	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TugasTekom2 frame = new TugasTekom2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}

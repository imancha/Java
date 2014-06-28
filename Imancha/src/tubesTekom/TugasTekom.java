package tubesTekom;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Arrays;

public class TugasTekom extends JFrame {

	private JPanel contentPane;
	private JTextField t1;
	String regex = "([^a-zA-Z']+)'*\\1*";
	String[] split = null;
	String state1 = null;
	String state2 = null;
	String state3 = null;
	String state4 = null;
	String tenses = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TugasTekom frame = new TugasTekom();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TugasTekom() {
		super("Sentence Checker");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel l1 = new JLabel("Masukan Kalimat");
		l1.setBounds(10, 11, 102, 14);
		contentPane.add(l1);
		
		t1 = new JTextField();
		t1.setBounds(122, 8, 312, 20);
		contentPane.add(t1);
		t1.setColumns(10);
		
		final JButton tombolCek = new JButton("Cek");

		tombolCek.setBounds(10, 40, 89, 23);
		contentPane.add(tombolCek);
		
		final JTextArea hasil = new JTextArea();
		hasil.setEditable(false);
		hasil.setBounds(10, 74, 444, 265);
		contentPane.add(hasil);
		
		JButton tombolReset = new JButton("Reset");
		tombolReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t1.requestFocus();
				hasil.setText(null);
			}
		});
		tombolReset.setBounds(109, 40, 89, 23);
		contentPane.add(tombolReset);
		
		tombolCek.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] split = t1.getText().split(regex);
				hasil.append("Kata yang didapat : "+Arrays.asList(split)+"\n"); 
				hasil.append("Token-token \n");
				for(int i=0;i<split.length;i++){
					if(split[i].equalsIgnoreCase("i")||(split[i].equalsIgnoreCase("you"))||(split[i].equalsIgnoreCase("we"))||(split[i].equalsIgnoreCase("they"))||(split[i].equalsIgnoreCase("he"))||(split[i].equalsIgnoreCase("she")) ){
						hasil.append(split[i]+" : t_S \n");
						state1 ="t_S";
					}	
					else if(split[i].equalsIgnoreCase("had")){
						hasil.append(split[i]+" : t_PaP \n");
						state2 ="t_PaP";
					}
					else if (split[i].equalsIgnoreCase("has")){
						hasil.append(split[i]+" : t_hs \n");
						state2 ="t_hs";
					}
					else if(split[i].equalsIgnoreCase("have")){
						hasil.append(split[i]+" : t_hv \n");
						state3 ="t_hv";
					}
					else if(split[i].equalsIgnoreCase("will")){
						hasil.append(split[i]+" : t_F \n");
						state2 ="t_F";
					}
					else if(split[i].matches("(.*)ed")){
						hasil.append(split[i]+" : t_RV \n");
						state4 ="t_RV";
					}
					else {
						hasil.append(split[i]+" : t_C \n");
					}
				}
				if ((state1=="t_S")&&(state2=="t_F")&&(state3=="t_hv")&&(state4=="t_RV")
					|| (state2=="t_F")&&(state1=="t_S")&&(state3=="t_hv")&&(state4=="t_RV")	){
					tenses = "Future Perfect Tense";
				}
				else if (
						(state1=="t_S")&&(state2=="t_PaP")&&(state4=="t_RV")
						|| (state2=="t_PaP")&&(state1=="t_S")&&(state4=="t_RV")
						){
					tenses = "Past Perfect Tense";
				} 
				else if ((state1=="t_S")&&((state2=="t_hs")||(state3=="t_hv"))&&(state4=="t_RV")){
					tenses = "Present Perfect Tense";
				}
				else if (state1!="t_S"){
					JOptionPane.showMessageDialog(tombolCek, split[0]+" Bukan termasuk dalam Subject");
					tenses = "Kata yang dimasukan bukan Subject";
				}
				else if ((state2!="t_F")||(state2!="t_PaP")||(state3=="t_hv")){
					JOptionPane.showMessageDialog(tombolCek, "Kata yang dimasukkan bukan kata bantu perfect Tense");
					
				}
				else {
					JOptionPane.showMessageDialog(tombolCek, "Format Kalimat Salah");
				}
				hasil.append(tenses+"\n");
				
				
			}
		});
		
		
	}
}

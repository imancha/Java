package com.imancha.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Imancha
 * 
 */

public class File {

	static ArrayList<String> list = new ArrayList<String>();

	static void loadFile(String file) throws FileNotFoundException {
		Scanner fin = new Scanner(new FileReader(file));

		while (fin.hasNextLine())
			list.add(fin.nextLine());

		fin.close();
	}

	static void uploadFile(String file) throws FileNotFoundException {
		PrintWriter fout = new PrintWriter(file);

		for (int i = 0; i < list.size(); i++)
			fout.println(list.get(i));

		fout.close();
	}

	public static void main(String[] args) throws FileNotFoundException {
		Scanner cin = new Scanner(System.in);

		loadFile("/mnt/A26002C460029EE3/Project/Imancha Java/Imancha/src/com/imancha/file/File.dat");

		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));

		String nama = cin.nextLine();

		if (!nama.equals(""))
			list.add(nama);

		uploadFile("File.dat");
		cin.close();
	}
}

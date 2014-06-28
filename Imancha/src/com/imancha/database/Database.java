package com.imancha.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Database {
	public final String driver = "com.mysql.jdbc.Driver";
	public final String url = "jdbc:mysql://localhost/dbpegawai";
	public final String username = "root";
	public final String password = "";

	public void tambah_pegawai(Pegawai p) {
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, username, password);
			stmt = conn.createStatement();
			String sql = "insert into pegawai values('" + p.getNIP() + "','"
					+ p.getNama() + "','" + p.getJenisKelamin() + "','"
					+ p.getTinggi() + "')";
			stmt.executeUpdate(sql);
		} catch (Exception e) {
			System.out.println("Error : " + e.getMessage());
		} finally {
			try {
				stmt.close();
			} catch (Exception e) {
			}
			try {
				conn.close();
			} catch (Exception se) {
			}
		}
	};

	public void hapus_pegawai(String nip) {
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, username, password);
			stmt = conn.createStatement();
			String sql = "delete from pegawai where nip='" + nip + "'";
			stmt.executeUpdate(sql);
		} catch (Exception e) {
			System.out.println("Error : " + e.getMessage());
		} finally {
			try {
				stmt.close();
			} catch (Exception e) {
			}
			try {
				conn.close();
			} catch (Exception se) {
			}
		}
	};

	public void update_pegawai(Pegawai p) {
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, username, password);
			stmt = conn.createStatement();
			String sql = "update pegawai set " + "nama='" + p.getNama() + "',"
					+ "jeniskelamin='" + p.getJenisKelamin() + "',"
					+ "tinggi='" + p.getTinggi() + "'" + "where nip='"
					+ p.getNIP() + "'";
			stmt.executeUpdate(sql);
		} catch (Exception e) {
			System.out.println("Error : " + e.getMessage());
		} finally {
			try {
				stmt.close();
			} catch (Exception e) {
			}
			try {
				conn.close();
			} catch (Exception se) {
			}
		}
	};

	public Pegawai pilih_1_pegawai(String nip) {
		Pegawai p = null;
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, username, password);
			stmt = conn.createStatement();
			String sql = "select nip,nama,jeniskelamin,tinggi"
					+ " from pegawai where nip='" + nip + "'";
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				p = new Pegawai(rs.getString("NIP"), rs.getString("nama"),
						rs.getString("JenisKelamin"), rs.getInt("tinggi"));
			} else
				p = null;
			rs.close();
		} catch (Exception e) {
			System.out.println("Error : " + e.getMessage());
		} finally {
			try {
				stmt.close();
			} catch (Exception e) {
			}
			try {
				conn.close();
			} catch (Exception se) {
			}
		}
		return p;
	}

	public ArrayList<Pegawai> select_seluruh_pegawai() {
		ArrayList<Pegawai> listPegawai = new ArrayList<Pegawai>();
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, username, password);
			stmt = conn.createStatement();
			String sql = "select nip,nama,jeniskelamin,tinggi from pegawai";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				listPegawai.add(new Pegawai(rs.getString("NIP"), rs
						.getString("Nama"), rs.getString("JenisKelamin"), rs
						.getInt("Tinggi")));
			}
			rs.close();
		} catch (Exception e) {
			System.out.println("Error : " + e.getMessage());
		} finally {
			try {
				stmt.close();
			} catch (Exception e) {
			}
			try {
				conn.close();
			} catch (Exception se) {
			}
		}
		return listPegawai;
	}

	public ArrayList<Pegawai> filter_pegawai(String keyword) {
		ArrayList<Pegawai> listPegawai = new ArrayList<Pegawai>();
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, username, password);
			stmt = conn.createStatement();
			String sql = "select nip,nama,jeniskelamin,tinggi from pegawai where nama like '%"
					+ keyword + "%'";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				listPegawai.add(new Pegawai(rs.getString("NIP"), rs
						.getString("Nama"), rs.getString("JenisKelamin"), rs
						.getInt("Tinggi")));
			}
			rs.close();
		} catch (Exception e) {
			System.out.println("Error : " + e.getMessage());
		} finally {
			try {
				stmt.close();
			} catch (Exception e) {
			}
			try {
				conn.close();
			} catch (Exception se) {
			}
		}
		return listPegawai;
	}
}

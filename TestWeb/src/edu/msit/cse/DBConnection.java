package edu.msit.cse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/test", "root", "iltwat");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}

package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		try {
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/company", 
					"root",
					"712476"
					);
			System.out.println("success");
			Statement stmt = conn.createStatement();
		} catch(SQLException e) {
			System.out.println("error: " + e);
		}
	}

}

package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DbConnection {

	public static void main(String[] args) {
		// jdbc-api -- done
		// mysql-class -- jar download

		
		//java.sql 
		
		// driver class

		// type 4 driver

		// URL -> jdbc:mysql://localhost:3306/25fullday
		// userName
		// password

		// URL ->

		String url = "jdbc:mysql://localhost:3306/25fullday";
		String userName = "root";
		String password = "root";

		try {
			// step 1: load driver class
			Class.forName("com.mysql.cj.jdbc.Driver");

			// step2 : est. connection
			Connection con = DriverManager.getConnection(url, userName, password);

			System.out.println(con);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

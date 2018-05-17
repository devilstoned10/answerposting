package com.yash.questionanswersimulation.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBUtil {
	
	private static String username="root";
	private static String pass="root";
	private static String url="jdbc:mysql://localhost/answer";
	private static String driverClassName="com.mysql.jdbc.Driver";
	static Connection con=null;
	static PreparedStatement pstmt=null;

	static{
		try {
			Class.forName(driverClassName);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	
	private static void connect() {
		try {
			con=DriverManager.getConnection(url, username, pass);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public static PreparedStatement createPreparedStatement(String sql) {
		
		try {
			connect();
			pstmt=con.prepareStatement(sql);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return pstmt;
	}
	
	protected static void closeConnection() {
		try {
			con.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}

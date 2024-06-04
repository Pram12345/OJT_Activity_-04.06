package jdbcConn;

import java.sql.*;

public class Conn {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
//		String user = "root";
//		String pass = "";
//	
		DriverManager.getConnection("jdbc:mysql://localhost:3306","root", "");
		
		System.out.println("connected...........");
		
		

		
	}
}

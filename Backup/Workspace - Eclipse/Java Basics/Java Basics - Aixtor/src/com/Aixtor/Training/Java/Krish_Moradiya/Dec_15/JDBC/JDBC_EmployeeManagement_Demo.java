package com.Aixtor.Training.Java.Krish_Moradiya.Dec_15.JDBC;
import java.sql.*;
public class JDBC_EmployeeManagement_Demo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		try {			
//			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Employee", "root", "root");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from Department");
			while(rs.next()) {
				System.out.println(rs.getInt(0));
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

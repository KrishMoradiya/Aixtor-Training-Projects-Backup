package test.con_test;
import java.sql.*;
public class ConnTest {
	public static void main(String[] args) throws SQLException,ClassNotFoundException{
		try {			
//			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Employee", "root", "root");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from Department");
			while(rs.next()) {
				System.out.println(rs.getInt(1));
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}

import java.sql.*;
import java.util.*;
public class DBClass {
	private Connection con;
	private ResultSet rs;
	private Statement st;
	private int status = -1;
	private String urlString = "jdbc:mysql://localhost:3306/student";
	private String user = "root";
	private String password = "root";
	
	public DBClass() {
		try {	
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(this.urlString,this.user,this.password);
		}
		catch (Exception e) {
			System.out.println(e.getMessage()+" "+e.getStackTrace());
		}
	}
	public int operation_AED(String query) throws SQLException {
		try {
			st = con.createStatement();
			status = st.executeUpdate(query);
		}
		catch (Exception e) {
			System.out.println(e.getMessage()+" "+e.getStackTrace());
		}
		return status;
	}
	public ResultSet getData(String query) throws SQLException {
		try {
			st = con.createStatement();
			rs = st.executeQuery(query);
		}
		catch (Exception e) {
			System.out.println(e.getMessage()+" "+e.getStackTrace());
		}
		return rs;
	}
}

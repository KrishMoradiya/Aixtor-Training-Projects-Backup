import com.Classes.Student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DBClass {
	private Connection con;
	private ResultSet rs;
	private Statement st;
	private int status = -1;
	private String urlString = "jdbc:mysql://localhost:3306/student?useSSL=false";
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
	public Student getDataByID(int id) throws SQLException {
		Student student = null;
		try {
			st = con.createStatement();
			rs = st.executeQuery("select * from studentdata where id="+id);
			rs.next();
			student = new Student();
			student.setId(id);
			student.setName(rs.getString("name"));
			student.setEmail(rs.getString("email"));
			student.setGender(rs.getString("gender"));
			student.setMobile(rs.getString("mobile"));
			student.setPassword(rs.getString("password"));
		}
		catch (Exception e) {
			System.out.println(e.getMessage()+" "+e.getStackTrace());
		}
		return student;
	}
	public void closeDBConnection() throws SQLException {
		if(con != null)
			con.close();
	}
}

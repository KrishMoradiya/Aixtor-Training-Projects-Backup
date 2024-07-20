

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String gender = request.getParameter("gender");
			String password = request.getParameter("password");
			String mobileNumber = request.getParameter("mobilenumber");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
			Statement st = con.createStatement();
			st.executeUpdate("INSERT INTO `student`.`user` (`UserID`,`UserName`, `Email`, `Gender`, `Password`, `MobileNumber`) VALUES (null,'"+name+"', '"+email+"', '"+gender+"', '"+password+"', '"+mobileNumber+"')");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}


}



import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String mobile = request.getParameter("mobile");
		PrintWriter out = response.getWriter();
		try {
			
			DBClass db = new DBClass();
			int status = db.operation_AED("insert into studentdata values(null,'"+name+"','"+email+"','"+password+"','"+gender+"','"+mobile+"')");
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
//			PreparedStatement ps = con.prepareStatement("insert into studentdata values(null,?,?,?,?,?)");
//			ps.setString(1,name);
//			ps.setString(2,email);
//			ps.setString(3,password);
//			ps.setString(4,gender);
//			ps.setString(5,mobile);
//			int status = ps.executeUpdate();
			if(status == 1)
				out.print("Inserted");
		}catch(Exception e) {
			System.out.println(e);;
		}
	}

}

package com.Aixtor.Training.KM.UserData;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RegisterServlet extends HttpServlet {
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try(PrintWriter out = response.getWriter()) {			
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String gender = request.getParameter("gender");
			String password = request.getParameter("password");
			String mobileNumber = request.getParameter("mobilenumber");
			
			Class.forName("com.mysql.jdbc.Driver");
			 String dbUrl = "jdbc:mysql://localhost:3306/student";
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
			Statement st = con.createStatement();
			String query = "INSERT INTO `student`.`user` (`UserName`, `Email`, `Gender`, `Password`, `MobileNumber`) VALUES ('"+name+"', '"+email+"', '"+gender+"', '"+password+"', '"+mobileNumber+"')";
			int status = st.executeUpdate(query);
			out.print(status);
//				DBClass db = new DBClass();
//				String query = "INSERT INTO `student`.`user` (`UserName`, `Email`, `Gender`, `Password`, `MobileNumber`) VALUES ('"+name+"', '"+email+"', '"+gender+"', '"+password+"', '"+mobileNumber+"')";
//				int status = db.operation_AED(query);
//				
//				if(status == 1)
//					out.print("inserted");
//				else
//					out.print("Something wrong");
		}
		catch(ClassNotFoundException e) {
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

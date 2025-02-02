

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
//import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import com.Classes.*;

@WebServlet("/GetStudentData")
public class GetStudentData extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		System.out.println("================ service called ============== ");
		
		DBClass db = null;
		Validation valid = null;
		try(PrintWriter out = response.getWriter()){
			response.setContentType("text/html");
			List<Student> studentList = new ArrayList<>();
			
			db = new DBClass();
			valid = new Validation();
			
			ResultSet rs = db.getData("select * from studentdata");
			
			while(rs.next()) {
				Student student = new Student();
				student.setId(rs.getInt("id"));
				student.setName(rs.getString("name"));
				student.setEmail(rs.getString("email"));
				student.setGender(rs.getString("gender"));
				student.setMobile(rs.getString("mobile"));
				student.setPassword(rs.getString("password"));
				studentList.add(student);
			}
			
			System.out.println(" studentList :: " + studentList);
			if(!(valid.isValidStudentList(studentList))) {
				out.print("<script>alert('No Record found...');</script>");
				request.getRequestDispatcher("index.jsp").include(request, response);
			}
			else {				
				request.setAttribute("studentData", studentList);
				RequestDispatcher rd = request.getRequestDispatcher("StudentData.jsp");
				rd.forward(request, response);
			}
				
		}catch(ServletException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				db.closeDBConnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

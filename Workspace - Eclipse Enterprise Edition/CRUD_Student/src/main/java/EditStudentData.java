

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import com.Classes.Student;
import com.Classes.Validation;

/**
 * Servlet implementation class EditStudentData
 */
public class EditStudentData extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try(PrintWriter out = response.getWriter()){
			DBClass db = null;
			response.setContentType("text/html");
			int id = Integer.parseInt(request.getParameter("id"));
			
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			String gender = request.getParameter("gender");
			String mobile = request.getParameter("mobile");
			
			Student student = new Student();
			student.setId(id);
			student.setName(name);
			student.setEmail(email);
			student.setPassword(password);
			student.setGender(gender);
			student.setMobile(mobile);
			try {
				Validation valid = new Validation();
				if(!(valid.isValidStudentWithID(student))) {
					out.print("<script>alert('Enter all the fields');</script>");
					request.getRequestDispatcher("Edit.jsp?id="+id).include(request, response);
				}
				else {
					db = new DBClass();
					int status = db.operation_AED("UPDATE `student`.`studentdata` SET `name` = '"+name+"', `email` = '"+email+"', `password` = '"+password+"', `gender` = '"+gender+"', `mobile` = '"+mobile+"' WHERE (`id` = '"+id+"')");
					if(status == 1) {
						out.print("<script>alert('Data Updated...');</script>");
						request.getRequestDispatcher("/GetStudentData").include(request, response);
					}
					else {
						out.print("<script>alert('Data not Updated...');</script>");
						request.getRequestDispatcher("Register.jsp?id="+id).include(request, response);
					}
				}
			}catch(Exception e) {
				System.out.print(e);
			}
			finally {
				try {
					db.closeDBConnection();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

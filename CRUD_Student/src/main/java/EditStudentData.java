

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class EditStudentData
 */
public class EditStudentData extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try(PrintWriter out = response.getWriter()){
			response.setContentType("text/html");
			int id = Integer.parseInt(request.getParameter("id"));
			
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			String gender = request.getParameter("gender");
			String mobile = request.getParameter("mobile");
			try {
				if(name.equals("") || name == null && email.equals("") || email == null && password.equals("") || password == null && gender.equals("") || gender == null && mobile.equals("") || mobile == null) {
					out.print("<script>alert('Enter all the fields');</script>");
					request.getRequestDispatcher("Edit.jsp?id="+id).include(request, response);
				}
				else {
					DBClass db = new DBClass();
					int status = db.operation_AED("UPDATE `student`.`studentdata` SET `name` = '"+name+"', `email` = '"+email+"', `password` = '"+password+"', `gender` = '"+gender+"', `mobile` = '"+mobile+"' WHERE (`id` = '"+id+"')");
					if(status == 1) {
						out.print("<script>alert('Data Updated...');</script>");
						request.getRequestDispatcher("/GetStudentData").include(request, response);
					}
					else {
						out.print("<script>alert('Data not Updated...');</script>");
						request.getRequestDispatcher("Edit.jsp?id="+id).include(request, response);
					}
				}
			}catch(Exception e) {
				System.out.print(e);
			}
			
			
		}catch(Exception e) {
			
		}
	}

}

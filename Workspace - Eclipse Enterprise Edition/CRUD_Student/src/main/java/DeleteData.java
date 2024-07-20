

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.io.*;

public class DeleteData extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try(PrintWriter out = response.getWriter()){
			
			int id=Integer.parseInt(request.getParameter("id"));
			DBClass db = new DBClass();
			
			String deleteQuery = "DELETE FROM `student`.`studentdata` WHERE (`id` = '"+id+"')";
			
			int status = db.operation_AED(deleteQuery);
			if(status == 1) {
				out.print("<script>alert(\"Delete Successfully...\")</script>");
				request.getRequestDispatcher("/").include(request, response);
			}
			else
				response.sendRedirect("/CRUD_Student/GetStudentData");
				
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

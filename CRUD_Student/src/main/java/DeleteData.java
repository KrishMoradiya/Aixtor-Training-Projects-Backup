

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class DeleteData extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try(PrintWriter out = response.getWriter()){
			
			int id=Integer.parseInt(request.getParameter("id"));
			DBClass db = new DBClass();
			
			String deleteQuery = "DELETE FROM `student`.`studentdata` WHERE (`id` = '"+id+"')";
			
			int status = db.operation_AED(deleteQuery);
			if(status == 1) {
				out.print("<script>alert(\"Delete Successfully...\")</script>");
				response.sendRedirect("/CRUD_Student/index.jsp");
			}
			else
				response.sendRedirect("/CRUD_Student/GetStudentData");
				
			
		}
		catch(Exception e) {
			
		}
	}

}

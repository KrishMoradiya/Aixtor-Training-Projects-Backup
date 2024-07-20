

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class AddServlet
 */
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try(PrintWriter out = response.getWriter()) {
			int num1 = Integer.parseInt(request.getParameter("number1"));
			int num2 = Integer.parseInt(request.getParameter("number2"));
			int sum = num1+num2;
			
			out.print(sum);
		}
		catch(Exception e) {
			System.out.print(e);
		}
	}

}

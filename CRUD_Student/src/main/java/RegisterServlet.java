

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String mobile = request.getParameter("mobile");
		PrintWriter out = response.getWriter();
		
		try {
			if(name.equals("") || name == null && email.equals("") || email == null && password.equals("") || password == null && gender.equals("") || gender == null && mobile.equals("") || mobile == null) {
				out.print("<script>alert('Enter all the fields');</script>");
				request.getRequestDispatcher("Register.jsp").include(request, response);
			}
			else {				
				DBClass db = new DBClass();
				int status = db.operation_AED("insert into studentdata values(null,'"+name+"','"+email+"','"+password+"','"+gender+"','"+mobile+"')");
				if(status == 1) {
					out.print("<script>alert('Data Inserted...');</script>");
					request.getRequestDispatcher("index.jsp").include(request, response);
				}
				else {
					out.print("<script>alert('Data not Inserted...');</script>");
					request.getRequestDispatcher("Register.jsp").include(request, response);
				}
//					response.sendRedirect("Register.jsp");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}

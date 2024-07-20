

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

import javax.net.ssl.SSLException;

import com.Classes.Student;
import com.Classes.Validation;

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
		DBClass db = null;
		int status = -1;
		response.setContentType("text/html");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String mobile = request.getParameter("mobile");
		PrintWriter out = response.getWriter();
		
		Student student = new Student();
		student.setName(name);
		student.setEmail(email);
		student.setPassword(password);
		student.setGender(gender);
		student.setMobile(mobile);
		
		try {
			Validation valid = new Validation();
			if(!(valid.isValidStudent(student))) {
				out.print("<script>alert('Enter all the fields');</script>");
				request.getRequestDispatcher("Register.jsp").include(request, response);
			}
			else {
				try {			
					db = new DBClass();
					status = db.operation_AED("insert into studentdata values(null,'"+name+"','"+email+"','"+password+"','"+gender+"','"+mobile+"')");
					if(status == 1) {
						out.print("<script>alert('Data Inserted...');</script>");
						request.getRequestDispatcher("index.jsp").include(request, response);
					}
					else {
						out.print("<script>alert('Data not Inserted...');</script>");
						request.getRequestDispatcher("Register.jsp").include(request, response);
					}
				}catch(SQLIntegrityConstraintViolationException e) {
					System.out.println("Integrity Exception");
					out.print("<script>alert('Data Already inserted...');</script>");
					request.getRequestDispatcher("Register.jsp").include(request, response);
				}
//					response.sendRedirect("Register.jsp");
			}
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}catch(IllegalStateException e) {
			System.out.println(e.getMessage());
		}catch(SSLException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

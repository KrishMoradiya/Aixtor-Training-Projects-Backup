

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

import com.Aixtor.Training.KM.UserData.DBClass;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try(PrintWriter out = response.getWriter()) {			
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String gender = request.getParameter("gender");
			String password = request.getParameter("password");
			String mobileNumber = request.getParameter("mobilenumber");
			 String url = "jdbc:mysql://localhost:3306/student";
			 String user = "root";
			 String dbPassword = "root";
			 int i = -1;
			 DBClass db;
			 String query;
				query = "INSERT INTO `student`.`user` (`UserName`, `Email`, `Gender`, `Password`, `MobileNumber`) VALUES ('"+name+"', '"+email+"', '"+gender+"', '"+password+"', '"+mobileNumber+"')";
				db = new DBClass(url,user,dbPassword);
				try {
					i = db.operation_AED(query);
				} catch (Exception e) {
					e.printStackTrace();
				}
				if(i == 1)
					System.out.println("Data inserted...");
				else
					System.out.println("Data not inserted...");
			
//				DBClass db = new DBClass();
//				String query = "INSERT INTO `student`.`user` (`UserName`, `Email`, `Gender`, `Password`, `MobileNumber`) VALUES ('"+name+"', '"+email+"', '"+gender+"', '"+password+"', '"+mobileNumber+"')";
//				int status = db.operation_AED(query);
//				
//				if(status == 1)
//					out.print("inserted");
//				else
//					out.print("Something wrong");
		}
		catch(Exception e) {
			System.out.println(e);
		}
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
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

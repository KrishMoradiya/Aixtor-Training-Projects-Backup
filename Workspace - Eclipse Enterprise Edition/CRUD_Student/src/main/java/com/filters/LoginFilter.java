package com.filters;

import javax.servlet.Filter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

//import org.apache.jasper.tagplugins.jstl.core.Out;

import com.Classes.AuthUser;
import com.Classes.DBClass;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class LoginFilter
 */
public class LoginFilter extends HttpFilter implements Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public LoginFilter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("Filter run...");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		HttpServletResponse res = (HttpServletResponse) response;
		PrintWriter out = res.getWriter();
		
		DBClass db = new DBClass();
			ResultSet rs = null;
			try {
				rs = db.getData("select * from studentdata where email='"+email+"' and password='"+password+"' LIMIT 1");
				if(rs.first()) {
					AuthUser.authUser = 1;
					System.out.println("Success");
					chain.doFilter(request, response);
				}
				else {
					AuthUser.authUser = 0;
					out.print("<script>alert('Your password or username does not match...');</script>");
					request.getRequestDispatcher("Signin.jsp").include(request, response);
					System.out.println("NotSuccess");
					
//					res.sendRedirect("/CRUD_Student/Signin.jsp");
				}
			} catch (SQLException e) {
//				e.printStackTrace();
			}
			
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
	}

}

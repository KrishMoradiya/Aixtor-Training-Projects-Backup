package com.filters;

import javax.servlet.Filter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

import com.Classes.AuthUser;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class AuthUserValidationFilter
 */
public class AuthUserValidationFilter extends HttpFilter implements Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public AuthUserValidationFilter() {
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
		HttpServletResponse res = (HttpServletResponse) response;
		HttpServletRequest req = (HttpServletRequest) request;
		PrintWriter out = res.getWriter();
		if(AuthUser.authUser == 1)
			chain.doFilter(request, response);
		else {
			String url = req.getRequestURL().toString();
			if(!(url.equals("http://localhost:8080/CRUD_Student/"))) {				
				out.print("<script>alert('First Login Please...');</script>");
				request.getRequestDispatcher("Signin.jsp").include(request, response);
			}
			else {
				request.getRequestDispatcher("Signin.jsp").include(request, response);
			}
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}

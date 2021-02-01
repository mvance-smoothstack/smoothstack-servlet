/**
 * 
 */
package com.smoothstack.servlet.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author max
 *
 */
//the below annotation must match a specified url-pattern in web.xml
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	//default value
	private static final long serialVersionUID = 1L;
	
	public LoginServlet() {
		super();
		//nothing special when making a new instance of this servlet
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html><head></head><body><h1>Hello world</h1></body></html>");
	}

}

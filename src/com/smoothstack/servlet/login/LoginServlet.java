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

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	//default value
	private static final long serialVersionUID = 1L;
	
	public LoginServlet() {
		super();
		//nothing special when making a new instance of this servlet
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html><head></head><body><h1>Login page</h1><br><p>Login: username foo, password bar<form action=\"LoginServlet\" method=\"POST\"><input type=\"text\" name=\"username\" placeholder=\"username\"><br><input type=\"password\" name=\"password\" placeholder=\"password\"><button>Submit</button></form></body></html>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String printMsg = "<html><head></head><body>";
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		//TODO: A real login page wouldn't use hardcoded values, nor would it save the password in plaintext.
		if (username.equals("foo") && password.equals("bar")) {
			printMsg = printMsg + "<h1>Login successful</h1>";
		} else {
			printMsg = printMsg + "<h1>Login failed</h1>";
		}
		printMsg = printMsg + "</body></html>";
		PrintWriter out = response.getWriter();
		out.print(printMsg);
	}

}

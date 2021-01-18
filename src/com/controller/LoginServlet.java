package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userName = "samir";
		String uName = request.getParameter("txtUserName");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print(uName);
		if (userName.equals(uName)) {

			request.setAttribute("loggedin", userName);
			request.getRequestDispatcher("Success").forward(request, response);

		} else {

			/// RESPONSE LOGINSERVLET
			out.print("USER NOT MATCHED..");
			request.getRequestDispatcher("LoginPage.html").include(request, response);
		}

	}

}

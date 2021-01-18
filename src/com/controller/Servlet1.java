package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/// FORWARD ...
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("SERVLET 1 in CONTROLLER");
		String name = "samir";
		request.setAttribute("name", name);
		out.print(name);
		/// END POINT
		request.getRequestDispatcher("Servlet2").forward(request, response);

	}

}

package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserThread
 */
public class UserThread extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// MIME TYPE...
		//response.setContentType("text/plain");
		response.setContentType("application/pdf");
		// pls...
		String name ="samir";
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("<h1>hello this is my first response..."+name+"</h1>");
		out.print("</body></html>");
		out.close();
	}

}

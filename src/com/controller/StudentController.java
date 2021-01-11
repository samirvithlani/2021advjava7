package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentController
 */
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		String studentName = request.getParameter("sName");
		String studentEmail = request.getParameter("sEmail");
		String age = request.getParameter("sAge");
		int sAge = 0;
		if (age != null && !age.equals("")) {

			sAge = Integer.parseInt(age);
		}
		String gender = request.getParameter("gender");
		String hobbies[] = request.getParameterValues("hobbies");
		// int sAge = Integer.parseInt(request.getParameter("sAge"));
		System.out.println(studentName + "--" + studentEmail + "-");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("<h1>Student name =" + studentName + "</h1>");

		out.print("<h2>Student email =" + studentEmail + "</h2>");
		out.print("<h2>Student email =" + sAge + "</h2>");
		out.print("<font color = 'red' size ='4' >gender =" + gender + "</font>");
		for (String s : hobbies) {

			out.print("<h4>" + s + "</h4>");
		}
		out.print("</body></html>");
		out.close();

	}

}

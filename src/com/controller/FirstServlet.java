package com.controller;

import java.io.IOException;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		String employeeName = request.getParameter("txtEmployeeName");
		String employeeEmail = request.getParameter("txtEmployeeEmail");
		String employeePassword = request.getParameter("pwdEmployeePassword");
		
		request.setAttribute("ename", employeeName);
		request.setAttribute("eemail", employeeEmail);
		request.setAttribute("epassword", employeePassword);
		System.out.println("first sevlet called...");
		
		
		//response.sendRedirect("url");
		//forward , include
		
		///response.sendRedirect("secondservlet");
		request.getRequestDispatcher("secondservlet").forward(request, response);
		
		
		
		
}

}

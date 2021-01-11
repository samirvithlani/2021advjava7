package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String employeeName = (String) request.getAttribute("ename");
		String employeeEmail = (String) request.getAttribute("eemail");
		String employeePassword = (String) request.getAttribute("epassword");
		
		System.out.println("second servlet called..");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html><body><title>SECOND SERVLEt</title>");
		out.print("<h1>"+employeeName+"</h1>");
		
		out.close();
	
		
	}

}

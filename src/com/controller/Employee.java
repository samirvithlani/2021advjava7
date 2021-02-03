package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Employee
 */
public class Employee extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	///url token null
	///token html /jsp

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// doPost(request, response);
		System.out.println("-----------");
	}
	

	/**
	 * @see HttpServlet#dreoPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int amount = Integer.parseInt(request.getParameter("amount"));
		String cardno = request.getParameter("cardno");
		System.out.println(amount);
		System.out.println(cardno);

	}

}

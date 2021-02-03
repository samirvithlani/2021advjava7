package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserRegistationController
 */
public class UserRegistationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

		String userName = request.getParameter("txtUserName");
		String userEmail = request.getParameter("txtUserEmail");
		String userPassword = request.getParameter("pwdUserPassword");
		String age = request.getParameter("txtUserAge");
		int userAge = 0;
		
		if (!age.equals("")) {

			userAge = Integer.parseInt(age);
		}

		String userContact = request.getParameter("txtUserContact");

		//method  ->isEmpty(String param) <<-boolean
		//static
		if (!userName.trim().equals("")) {

			// true
			request.setAttribute("uname", userName);
			request.getRequestDispatcher("Success.jsp").forward(request, response);
		} else {

			// false
			request.setAttribute("uname", "user name is required");
			request.getRequestDispatcher("UserRegistration.jsp").forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

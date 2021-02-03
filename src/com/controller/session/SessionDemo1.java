package com.controller.session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionDemo1
 */
public class SessionDemo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/// HTTPSESSION
		HttpSession session = request.getSession();
		
		/// key value
		String name = "samir";
		session.setAttribute("name", name);
		System.out.println("ser 1" + session.getId());

	}

}

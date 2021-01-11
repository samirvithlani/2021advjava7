package com.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Backup2
 */
public class Backup2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletConfig config = getServletConfig();
		String fpath = config.getInitParameter("filepath");
		String fpath1 = config.getInitParameter("filepath1");
		System.out.println(fpath);
		System.out.println(fpath1);
		
		
		ServletContext ctx = getServletContext();
		String driver = ctx.getInitParameter("driver");
		System.out.println(driver);

	}

}

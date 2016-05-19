/* 
 * Copyright 2016 SWM Services GmbH
 */
package de.swm.spirngsecuritydemo.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;



/**
 * @author xie.fei
 * @since 1.0
 */
@WebServlet("/myservlet")
public class MyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		writer.write("Ok response");
		writer.close();
	}
}

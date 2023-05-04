package com.om;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet
{
	
	//public void doPost(HttpServletRequest req, HttpServletResponse res) //only accept method="post"
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException , ServletException //only accept method="get"

	//public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i+j;
		
		req.setAttribute("k", k);
		
		RequestDispatcher rd = req.getRequestDispatcher("sq");
		rd.forward(req, res);
		
//		PrintWriter out = res.getWriter();
//		out.println("Result is "+k);
		
	}
}

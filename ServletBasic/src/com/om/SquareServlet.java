package com.om;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException , ServletException
	{
		int k = (int)req.getAttribute("k");
		k=k*k;
		PrintWriter out = res.getWriter();
		out.println("Square is " + k);
	}
}

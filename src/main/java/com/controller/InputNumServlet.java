package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InputNumServlet")
public class InputNumServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//read 
		String strN1 = request.getParameter("n1");
		String strN2 = request.getParameter("n2");
		String opr = request.getParameter("opr");
		
		
		//parse 
		int n1 = Integer.parseInt(strN1);
		int n2 = Integer.parseInt(strN2); 
		PrintWriter out = response.getWriter(); 
		
		if(opr.equals("add")) {
			int ans = n1+n2; 
			out.print(ans);
		}else if(opr.equals("mul")) {
			out.print(n1*n2);
		}
		
 		
		
		
	}
}

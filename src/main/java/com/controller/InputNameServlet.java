package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InputNameServlet")
public class InputNameServlet extends HttpServlet{

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name = request.getParameter("name");
		boolean isError = false; //no error 
		String error  = "";
		if(name==null || name.isBlank()) {
			isError = true;
			error = "Please Enter Name";
		}
		
		//isError == true
		if(isError) {
			
			RequestDispatcher rd = request.getRequestDispatcher("InputName.jsp");
			rd.forward(request, response);
			
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("OutputName.jsp");
			rd.forward(request, response);
			
		}
		
		
		
		
		
	}
}

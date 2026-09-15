package com.controller;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet{

	//doPost 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("SignupServlet::service()");
		
		//body -> json -> read 
		//DRY 
		
		//read => parameters 
		String firstName = request.getParameter("firstName");
		String lastName  = request.getParameter("lastName");
		String email = request.getParameter("email");
		String password = request.getParameter("password"); 
		
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(email);
		System.out.println(password);
	}
}

package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/InputSessionController")
public class InputSessionController extends HttpServlet{

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//read 
		String userName = request.getParameter("userName");
		
		//session 
		HttpSession session = request.getSession(); 
		session.setAttribute("userName", userName);
		
		session.setMaxInactiveInterval(60*5);//5 minutes 
		
		response.sendRedirect("SessionHome.jsp");
	
	}
}

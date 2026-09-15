package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DoGetDoPostController")
public class DoGetDoPostController extends HttpServlet{

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("doGet() : DoGetDoPostController");
	
		String firstName = request.getParameter("firstName");
		
		System.out.println("FirstName => "+firstName);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("doPost() : DoGetDoPostController");
	
		String firstName = request.getParameter("firstName");
		
		System.out.println("FirstName => "+firstName);
	}
}

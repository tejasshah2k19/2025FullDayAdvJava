package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CookieCityController")
public class CookieCityController extends HttpServlet{

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
			String city = request.getParameter("city");
	
			//cookie 
			//create
			Cookie c = new Cookie("city", city);
			c.setMaxAge(60*60*24*7);//second 
			
			//set 
			response.addCookie(c);
			//0
			
			//
			response.sendRedirect("CookieHome.jsp");
	}
}

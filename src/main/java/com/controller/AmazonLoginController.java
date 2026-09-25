package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AmazonLoginController")
public class AmazonLoginController extends HttpServlet{

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		


		
		String email = request.getParameter("email");
		String password =request.getParameter("password");
		
		//validation 
		
		if(email.equalsIgnoreCase("user@gmail.com") && password.equals("user")) {
		
			//browser -> cookie -> loggedIn 
			Cookie c = new Cookie("loggedIn", "yes");
			c.setMaxAge(60*60*24*7);//7days 
			response.addCookie(c);//browser set 
			
			response.sendRedirect("AmazonWishList.jsp");
			//WishList.jsp 
		}else {
			request.setAttribute("error", "Invalid Credentials");
			RequestDispatcher rd = request.getRequestDispatcher("AmazonLogin.jsp");
			rd.forward(request, response);
//			response.sendRedirect("AmazonLogin.jsp");

		}
		
		
	
	}
}

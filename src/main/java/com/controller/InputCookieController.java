package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/InputCookieController")
public class InputCookieController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//read 
		String cName = request.getParameter("cname");
		String cValue = request.getParameter("cvalue");
		
		//validation 
		
		//goback
		
		//else
		Cookie c = new Cookie(cName, cValue);
		response.addCookie(c); // browser cookie 
	
		request.setAttribute("msg", "cookie addedd");
		
		request.getRequestDispatcher("InputCookie.jsp").forward(request, response);
		
	
	}
}





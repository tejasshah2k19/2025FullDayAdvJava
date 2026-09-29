package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ListCookieController")
public class ListCookieController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// get all cookies
		Cookie c[] = request.getCookies();

		request.setAttribute("c", c);
		//jsp 
		RequestDispatcher rd = request.getRequestDispatcher("ListCookie.jsp");
		rd.forward(request, response);
	}
}

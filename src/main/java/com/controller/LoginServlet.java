package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.Validators;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("LoginServlet :: service() ");
		System.out.println("Second line ----------> ");

		String email = request.getParameter("email");
		String password = request.getParameter("password");

		boolean isError = false;

		if (Validators.isBlank(email)) {
			isError = true;
			request.setAttribute("emailError", "Please Enter Email");
		}
		if (Validators.isBlank(password)) {
			isError = true;
			request.setAttribute("passwordError", "Please Enter Password");
		}

		if (isError) {
			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			rd.forward(request, response);
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
			rd.forward(request, response);
			
		}

	}
}

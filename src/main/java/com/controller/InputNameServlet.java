package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.Validators;

@WebServlet("/InputNameServlet")
public class InputNameServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
 
		boolean isError = false; // no error
		if (Validators.isBlank(name)) {
			isError = true;
			request.setAttribute("nameError", "Please Enter Name");
		} else if (!Validators.isValidAlpha(name)) {
			isError = true;
			request.setAttribute("nameError", "Please Enter Valid Name");
			request.setAttribute("nameValue", name);
		} else {
			request.setAttribute("nameValue", name);
		}

		if (Validators.isBlank(email)) {
			isError = true;
			request.setAttribute("emailError", "Please Enter Email");
		} else {
			request.setAttribute("emailValue", email);
		}

		if (Validators.isBlank(password)) {
			isError = true;
			request.setAttribute("passwordError", "Please Enter Password");
		}
		// isError == true
		if (isError) {
			RequestDispatcher rd = request.getRequestDispatcher("InputName.jsp");
			rd.forward(request, response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("OutputName.jsp");
			rd.forward(request, response);

		}
	}
}

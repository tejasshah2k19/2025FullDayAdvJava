package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import com.util.Validators;

@WebFilter("/SignupServletF")
public class SignupFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		System.out.println("doFilter() : SignupFilterF");

		// read
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");

		// validate
		boolean isError = false;
		if (firstName == null || firstName.isBlank()) {
			isError = true;
			request.setAttribute("firstNameError", "Please Enter FirstName");
		}

		if (Validators.isBlank(lastName)) {
			isError = true;
			request.setAttribute("lastNameError", "Please Enter LastName");
		}

		if (isError) {

			// go back
			RequestDispatcher rd = request.getRequestDispatcher("FilterSignup.jsp");
			rd.forward(request, response);
			
		} else {

			// go ahead
			chain.doFilter(request, response);
		}
	}

}

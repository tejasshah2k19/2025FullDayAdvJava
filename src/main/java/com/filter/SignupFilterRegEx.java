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
public class SignupFilterRegEx implements Filter{

		public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
				throws IOException, ServletException {
		
			System.out.println("doFilter() : SignupFilterRegEx");

			String firstName  = request.getParameter("firstName");
			String lastName = request.getParameter("lastName");
			
			String alphaRegex = "[a-zA-Z]+";
			boolean isError = false;
			
			if(firstName.matches(alphaRegex)== false) {
				isError = true; 
				request.setAttribute("firstNameError", "Please Enter Valid FirstName");
			}
//			if(!lastName.matches(alphaRegex)) {
//				
//			}
			if(Validators.isValidAlpha(lastName) == false)
			{
				isError = true;
				request.setAttribute("lastNameError", "Please Enter Valid LastName");
			}
			
			if(isError) {
				//go back 
				RequestDispatcher rd = request.getRequestDispatcher("FilterSignup.jsp");
				rd.forward(request, response);
			}else {
				//go ahead 
				chain.doFilter(request, response);
			}
			
		}
	
}

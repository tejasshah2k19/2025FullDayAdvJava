package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.Validators;

@WebServlet("/GirRegController")
public class GirRegController extends HttpServlet {

	public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException {
		
		//read 
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String city = request.getParameter("city");
		String contact = request.getParameter("contact");
		
		
		boolean isError = false; 
		//validation
		if(Validators.isBlank(name)) {
			request.setAttribute("nameError", "Please Enter Name");
			isError = true; 
		}else if(Validators.isValidAlpha(name) == false) {
			request.setAttribute("nameError", "Please Enter Valid Name");
			request.setAttribute("nameValue", name);
		}else {
			request.setAttribute("nameValue", name);
		}

		if(Validators.isBlank(gender)) {
			isError = true;
			request.setAttribute("genderError", "Please Select Gender");
		}else {
			request.setAttribute("genderValue", gender);
		}
		
		if(Validators.isBlank(city) || city.equals("-1") ) {
			isError = true;
			request.setAttribute("cityError", "Please Select City");
		}else {
			request.setAttribute("cityValue", city);
		}
		
		if(Validators.isBlank(contact)) {
			isError = true; 
			request.setAttribute("contactError", "Please Enter Contact Detail");
		}else {
			request.setAttribute("contactValue", contact);
		}
		
		if(isError) {
			//fail 
			RequestDispatcher rd = request.getRequestDispatcher("GirReg.jsp");
			rd.forward(request, response);
		}else {
			//success

			RequestDispatcher rd = request.getRequestDispatcher("GirSuccess.jsp");
			rd.forward(request, response);
		}
		
		
	}
}

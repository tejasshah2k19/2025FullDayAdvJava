package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.StudentBean;

@WebServlet("/InternshipRegistrationController")
public class InternshipRegistrationController extends HttpServlet {

	// doGet
	// doPost
	
	ArrayList<StudentBean> list = new ArrayList<StudentBean>();
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// read
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String technology = request.getParameter("technology");
		String collegeName = request.getParameter("collegeName");

		// validate
		boolean isError = false;

		if (name == null || name.isBlank()) {
			isError = true;
			request.setAttribute("nameError", "Please Enter Name");
		}

		if (email == null || email.isBlank()) {
			isError = true;
			request.setAttribute("emailError", "Please Enter Email");
		}

		if (technology == null || technology.isBlank()) {
			isError = true;
			request.setAttribute("technologyError", "Please Enter Technology");
		}
		if (collegeName == null || collegeName.isBlank()) {
			isError = true;
			request.setAttribute("collegeNameError", "Please Enter College Name");
		}


		if(isError) { //if(isError == true ) 
			RequestDispatcher rd = request.getRequestDispatcher("InternshipReg.jsp");
			rd.forward(request, response);
		}else {
			StudentBean bean = new StudentBean();
			bean.setName(name);
			bean.setEmail(email);
			bean.setCollegeName(collegeName);
			bean.setTechonology(technology);
			
			list.add(bean);
			
			request.setAttribute("list", list);
			//success jsp 
			RequestDispatcher rd = request.getRequestDispatcher("InternshipSuccess.jsp");
			rd.forward(request, response);
			
		}
		
		
		
	}

}

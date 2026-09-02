package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Calendar;
import java.util.Date;

@WebServlet("/VoteServlet")
public class VoteServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String birthYearStr = request.getParameter("birthYear");// String
		String gender = request.getParameter("gender");
		String voteStatus = "";
		String error = "";
		
		String alphaRegEx = "[a-zA-Z]+";  //+ => min:1 , max:n * => min:0 max:n 
		String digitRegEx = "[0-9]{4}"; //
		boolean isError = false;
		// validation
		if (name == null || name.isBlank()) {
			error = "Please Enter Name<br>";
			isError = true;
		}else if(name.matches(alphaRegEx)==false) {
			error = "Please Enter Valid Name<br>";
			isError = true;
		}

		if (birthYearStr == null || birthYearStr.isBlank()) {
			error += "Please Enter BirthYear<br>";
			isError = true;
		}else if(birthYearStr.matches(digitRegEx)==false) {
			error += "Please Enter Valid BirthYear<br>";
			isError = true;
		}

		if (gender == null || gender.isBlank()) {
			error += "Please Select Gender<br>";
			isError = true;
		}

		// logic
		// util ->Date , Calendar

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		if (isError == true) {
			// error
			out.print("<font color=red>"+error+"</font>");
		} else {
			Calendar c = Calendar.getInstance();
			int year = c.get(Calendar.YEAR);
			int birtYear = Integer.parseInt(birthYearStr);
			int age = year - birtYear;

			if (gender.equals("male") && age >= 21) {
				voteStatus = "Eligible for Voting";
			} else if (gender.equals("female") && age >= 23) {
				voteStatus = "Eligible For Voting";
			} else {
				voteStatus = "NOT Eligible For Voting";
			}

			out.print("Name => " + name + "<br>");
			out.print("Age => " + age + "<br>");
			out.print("Gender => " + gender + "<br>");
			out.print("VoteStatus => " + voteStatus + "<br>");

		}

		System.out.println("VoteServlet call.....");
	}
}

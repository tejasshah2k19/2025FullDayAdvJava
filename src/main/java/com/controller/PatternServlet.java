package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PatternServlet")
public class PatternServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		String strNum = request.getParameter("num");
	
		int num = Integer.parseInt(strNum);
		
		
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println(""); 
		}
	
		
		//browser response 
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				 out.print(j);
			}
			 out.println("<br>"); 
		}
	
		out.print("</body>");
		out.print("</html>");
		
		
		
		
	}
}

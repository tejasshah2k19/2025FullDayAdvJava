package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SerlvetLifeCycle")
public class SerlvetLifeCycle extends HttpServlet{
	//sever>Servlet memory? 
	//no ->
	//1 : load class 
	//2 : create instance 
	//3 : init 
	//4 : service 
	//5 : destroy 
	
	
	//first request 
	public void init() {
		System.out.println("init() : ServletLifeCycle");
	}
	
	//all time 
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service() : ServletLifeCycle");
	}
	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	}
//	
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	}
//	
	
	
	
	//shutdown 
	public void destroy() {
		System.out.println("destroy() : ServletLifeCycle");
	}
}

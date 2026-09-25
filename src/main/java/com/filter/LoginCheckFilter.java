package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/AmazonWishList.jsp")
public class LoginCheckFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		// loggedIn ? cookie present ?
		// yes -> access
		// no -> login

		float f = 12.23f;
		int x = (int) f;

		HttpServletRequest req = (HttpServletRequest) request;

		Cookie allCookie[] = req.getCookies();// browser --> server

		boolean isLogIn = false;

		if (allCookie != null) {
			for (Cookie tmp : allCookie) {
				if (tmp.getName().equals("loggedIn")) {
					isLogIn = true;
				}
			}
		}
		
		if (isLogIn) {
			chain.doFilter(request, response);// AmazonWishList.jsp
		} else {

			HttpServletResponse resp = (HttpServletResponse) response;
			resp.sendRedirect("AmazonLogin.jsp");

		}

	}
}

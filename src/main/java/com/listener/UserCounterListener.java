package com.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class UserCounterListener implements HttpSessionListener {

	int counter = 0;

	public void sessionCreated(HttpSessionEvent se) {
		counter++;
		System.out.println("User IN "+counter);
	}

	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("User OUT"+counter);
		counter--;
	}

}

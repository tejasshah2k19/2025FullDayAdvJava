package com.util;

public class Validators {

	
	public static boolean isBlank(String data) {
		if(data == null || data.isBlank()) {
			return true;
		}
		return false;
	}
	
	
	public static boolean isValidAlpha(String data) {
		String alphaRegex = "[a-zA-Z]+";
		return data.matches(alphaRegex);//false
		
	}
}

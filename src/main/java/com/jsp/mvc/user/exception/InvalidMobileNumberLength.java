package com.jsp.mvc.user.exception;

public class InvalidMobileNumberLength extends Exception{
	private String message;

	public InvalidMobileNumberLength(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}

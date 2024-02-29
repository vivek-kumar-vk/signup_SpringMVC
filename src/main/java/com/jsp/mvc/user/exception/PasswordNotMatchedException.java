package com.jsp.mvc.user.exception;

public class PasswordNotMatchedException extends Exception{

	private String message;

	public PasswordNotMatchedException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}

package com.jsp.mvc.user.exception;

public class InvalidEmailException extends Exception {
	
	private String message;

	public InvalidEmailException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}

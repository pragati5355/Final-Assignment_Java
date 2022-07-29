package com.mindbowser.stripepayment.exception;

public class ErrorResponse {

	private String message;

	private int statusCode;

	private String error;

	public ErrorResponse(String message, int statusCode, String error) {
		super();
		this.message = message;
		this.statusCode = statusCode;
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public String getError() {
		return error;
	}

}

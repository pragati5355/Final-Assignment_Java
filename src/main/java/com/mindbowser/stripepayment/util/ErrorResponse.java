package com.mindbowser.stripepayment.util;

import java.sql.Date;

public class ErrorResponse {

	private Date timestamp;

	private String message;

	private String details;

	private int statusCode;

	private String error;

	public ErrorResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ErrorResponse(Date timestamp, String message, String details, int statusCode, String error) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
		this.statusCode = statusCode;
		this.error = error;
	}

	public ErrorResponse(java.util.Date date, String message2, String message3, int code, String message4) {
		// TODO Auto-generated constructor stub
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public String getError() {
		return error;
	}

}

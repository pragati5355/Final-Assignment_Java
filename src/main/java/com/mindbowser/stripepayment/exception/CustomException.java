package com.mindbowser.stripepayment.exception;

import com.mindbowser.stripepayment.enums.ErrorCode;

public class CustomException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private String message;

	private ErrorCode errorCode;

	public CustomException() {
		super();
	}

	public CustomException(String message, ErrorCode errorCode) {
		super();
		this.message = message;
		this.errorCode = errorCode;
	}

	public CustomException(ErrorCode internalServerError, String message2) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ErrorCode getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(ErrorCode errorCode) {
		this.errorCode = errorCode;
	}

}

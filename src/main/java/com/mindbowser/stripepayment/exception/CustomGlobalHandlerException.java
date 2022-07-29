package com.mindbowser.stripepayment.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomGlobalHandlerException {

	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ErrorResponse CustomException(Exception e) {
		return new ErrorResponse("Product not found", HttpStatus.NOT_FOUND.value(), e.getMessage());
	}

}

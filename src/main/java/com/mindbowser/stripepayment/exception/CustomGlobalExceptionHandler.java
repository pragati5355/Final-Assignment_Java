package com.mindbowser.stripepayment.exception;

import java.util.Date;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.mindbowser.stripepayment.util.ErrorResponse;

@RestControllerAdvice
public class CustomGlobalExceptionHandler {

	@ExceptionHandler(value = {CustomException.class})
	public ErrorResponse handleCustomException(CustomException e) {
		return new ErrorResponse(new Date(), "Something Went Wrong",
				e.getMessage(), e.getErrorCode().getCode(),
				e.getMessage());
	}

}

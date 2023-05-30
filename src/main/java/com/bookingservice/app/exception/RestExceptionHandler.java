package com.bookingservice.app.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler {
	
	@ExceptionHandler(ShipmentIdNotFoundException.class)
	public ResponseEntity<ResponseError> ShipmentIdNotFoundExceptionHandler
	                                     (ShipmentIdNotFoundException e,
	                                    	HttpServletRequest request){
		
		ResponseError error=new ResponseError(e.getMessage());
		
		return new ResponseEntity<ResponseError>(error,HttpStatus.NOT_FOUND);
	}

}

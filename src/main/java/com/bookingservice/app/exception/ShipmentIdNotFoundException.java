package com.bookingservice.app.exception;

public class ShipmentIdNotFoundException extends RuntimeException{
	
	public ShipmentIdNotFoundException(String msg) {
		super(msg);
	}

}

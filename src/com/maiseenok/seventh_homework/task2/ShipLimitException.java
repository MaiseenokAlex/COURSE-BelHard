package com.maiseenok.seventh_homework.task2;

public class ShipLimitException extends Exception{
	private static final long serialVersionUID = -2192329191576564818L;

	public ShipLimitException() {
		super();
	}
	
	public ShipLimitException(String message) {
		super(message);
	}
	
	public ShipLimitException(Throwable cause) {
		super(cause);
	}
	
	public ShipLimitException(String message, Throwable cause) {
		super(message,cause);
	}
}

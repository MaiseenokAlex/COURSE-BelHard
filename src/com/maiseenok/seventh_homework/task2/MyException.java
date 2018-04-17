package com.maiseenok.seventh_homework.task2;

public class MyException extends Exception{
	private static final long serialVersionUID = -2192329191576564818L;

	public MyException() {
		super();
	}
	
	public MyException(String message) {
		super(message);
	}
	
	public MyException(Throwable cause) {
		super(cause);
	}
	
	public MyException(String message, Throwable cause) {
		super(message,cause);
	}
}

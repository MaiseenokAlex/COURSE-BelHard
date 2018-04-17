package com.maiseenok.seventh_homework.task1;

public class MyException extends Exception{
	private static final long serialVersionUID = -6492329191276564818L;

	public MyException() {
		super();
	}
	
	public MyException(String message) {
		super(message+" не возвращает книги. Больше не допускается в библиотеку!!");
	}
	
	public MyException(Throwable cause) {
		super(cause);
	}
	
	public MyException(String message, Throwable cause) {
		super(message,cause);
	}
}

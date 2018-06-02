package com.maiseenok.seventh_homework.task1;

public class BookLimitException extends Exception {
	private static final long serialVersionUID = -6492329191276564818L;

	public BookLimitException() {
		super();
	}

	public BookLimitException(String message) {
		super(message + " не возвращает книги. Больше не допускается в библиотеку!!");
	}

	public BookLimitException(Throwable cause) {
		super(cause);
	}

	public BookLimitException(String message, Throwable cause) {
		super(message, cause);
	}
}

package com.maiseenok.user_base.exception;

public class WrongIdException extends Exception{
	private static final long serialVersionUID = 95927475619885250L;
	
	public WrongIdException(String message) {
		super(message);
	}
}

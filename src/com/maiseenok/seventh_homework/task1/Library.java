package com.maiseenok.seventh_homework.task1;

/*
 * Библиотека выдаёт книгу если человек ещё не брал данную книгу. Если человек пытается 
 * взять шестую книгу, то выбрасывает исключение
*/

import java.util.ArrayList;
import java.util.List;

public class Library {
	public static List<Reader> list=new ArrayList<Reader>();
	
	 synchronized public static boolean giveBook(Reader book, Human human) throws MyException {
		if (human.getReaderTicket().contain(book))
			return false;
		if (human.getReaderTicket().getAmount() == 6) {
			throw new MyException(human.getName());
		} 
		return true;
	}
}

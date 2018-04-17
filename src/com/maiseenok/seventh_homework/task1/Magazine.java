package com.maiseenok.seventh_homework.task1;

import java.util.Random;

public class Magazine extends Reader{
	private final boolean isSoft=true;

	public Magazine() {
	}

	public Magazine(Reader b) {
		setTitle(b.getTitle());
		setAuthor(b.getAuthor());
		setGenre(b.getGenre());
		setYear(b.getYear());
		setReadOnly(b.isReadOnly());
		setReadOnly(new Random().nextBoolean());
	}
	
	public Magazine(String title, String author, String genre, int year, boolean isReadOnly) {
		setTitle(title);
		setAuthor(author);
		setGenre(genre);
		setYear(year);
		setReadOnly(isReadOnly);
	}
	
	public boolean isSoft() {
		return isSoft;
	}
}

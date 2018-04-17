package com.maiseenok.seventh_homework.task1;
/*
 * Книга, которая может быть либо художественной книгой, либо журналом
*/
public class Reader {
	private String title;
	private String author;
	private String genre;
	private int year;
	private boolean readOnly;
	
	public Reader() {
	}
	
	@Override
	public String toString() {
		return " Title = " + title + ",\n Author = " + author + ",\n Genre = " + genre + ",\n"
				+ " Year = " + year + ",\n ReadOnly = " + readOnly+"\n" ;
	}

	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}

	public String getGenre() {
		return genre;
	}

	public int getYear() {
		return year;
	}

	public void setReadOnly(boolean readOnly) {
		this.readOnly = readOnly;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isReadOnly() {
		return readOnly;
	}
}

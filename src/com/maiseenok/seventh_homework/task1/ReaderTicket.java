package com.maiseenok.seventh_homework.task1;

/*
 * Читательский билет, который хранит отдельно список книг в зале и список книг дома
*/

import java.util.ArrayList;
import java.util.List;

public class ReaderTicket {
	public List<Reader> booksAtHall=new ArrayList<>();
	public List<Reader> booksAtHome=new ArrayList<>();
	
	public int getAmount() {
		return booksAtHall.size()+booksAtHome.size();
	}
	
	public boolean contain(Reader book) {
		if(booksAtHall.contains(book))
			return true;
		if(booksAtHome.contains(book))
			return true;
		return false;
	}

	@Override
	public String toString() {
		StringBuffer sb=new StringBuffer();
		sb.append("\n-----В зале читает = ");
		for(Reader b: booksAtHall) {
			sb.append(b.getTitle());
			sb.append("; ");
		}
		sb.append("\n-----Дома читает = ");
		for(Reader b: booksAtHome) {
			sb.append(b.getTitle());
			sb.append("; ");
		}
		sb.append("\n");
		return sb.toString();
	}
	
}

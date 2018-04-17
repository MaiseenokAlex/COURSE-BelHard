package com.maiseenok.seventh_homework.task1;

public class Runner {
	static final String[] people= {"Александр Леонов","Юрий Семенков","Ольга Леонтьева","Александра Горбацевич",
				"Евгений Иванов","Константин Науменко","Сергей Дворядкин","Антон Василевский"};	
	
	static {
		if(XMLprocessing.validateXML("src/com/maiseenok/seventh_homework/BooksChecker.xsd",
				"src/com/maiseenok/seventh_homework/Books.xml")) {
			System.out.println("XML-file is valid");
			XMLprocessing.readXML(Library.list,"src/com/maiseenok/seventh_homework/books.xml");
		}
	}
	
public static void main(String[] args) {
	for (int i = 0; i < 8; i++) {
		new Human(people[i]);
	}
}
}

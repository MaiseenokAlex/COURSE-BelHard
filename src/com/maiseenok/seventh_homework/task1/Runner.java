package com.maiseenok.seventh_homework.task1;

public class Runner {
	static final String[] people = { "Александр Леонов", "Юрий Семенков", "Ольга Леонтьева", "Александра Горбацевич",
			"Евгений Иванов", "Константин Науменко", "Сергей Дворядкин", "Антон Василевский" };

	static {
		if (XMLprocessing.validateXML("src/com/maiseenok/seventh_homework/task1/BooksChecker.xsd",
				"src/com/maiseenok/seventh_homework/task1/Books.xml")) {
			System.out.println("XML-file is valid");
			XMLprocessing.readXML(Library.list, "src/com/maiseenok/seventh_homework/task1/Books.xml");
		}
		else
			System.out.println("XML-file incorrect");
	}

	public static void main(String[] args) {
		for (int i = 0; i < 8; i++) {
			new Human(people[i]);
		}
	}
}

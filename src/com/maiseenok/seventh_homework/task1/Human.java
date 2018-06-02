package com.maiseenok.seventh_homework.task1;

/*
 * Человек, у которого есть имя и читательский билет.
 * при запуске потока человек берёт книгу и если можно, то берёт её домой иначе читает в зале
 * в 30% случаев возвращает книгу
 * повторяет 10 раз
*/

import java.util.Random;

public class Human implements Runnable, IHumanInLibrary {
	private String name;
	private ReaderTicket myTicket;

	Human(String name) {
		this.name = name;
		myTicket = new ReaderTicket();
		Thread t = new Thread(this, name);
		t.start();
	}

	public ReaderTicket getReaderTicket() {
		return myTicket;
	}

	@Override
	public void run() {
		try {
			MyLambda lambda;
			lambda = (name, b) -> System.out.println(name + " читает в зале " + b.getTitle());
			for (int i = 0; i < 10; i++) {
				Reader b = askBook();
				if (Library.giveBook(b, this))
					if (b.isReadOnly()) {
						myTicket.booksAtHall.add(b);
						lambda.takenReader(name, b);
						Thread.sleep(1000);
					} else {
						myTicket.booksAtHome.add(b);
						lambda.takenReader(name, b);
						Thread.sleep(2000);
					}
				int rand = new Random().nextInt(10);
				if (rand > 6)
					System.out.println(returnBook().getTitle());
				Thread.sleep(200);
			}
		} catch (InterruptedException | BookLimitException e) {
			System.out.println("!!!!!!!!    " + e.getMessage() + "     !!!!!!!");
		} finally {
			System.out.println("-----" + name + this.myTicket);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Reader askBook() {
		Random rand = new Random();
		return Library.list.get(rand.nextInt(Library.list.size() - 1));
	}

	public void add(Reader book) {
		if (book.isReadOnly())
			myTicket.booksAtHall.add(book);
		else
			myTicket.booksAtHome.add(book);
	}

	public Reader returnBook() {
		int amount = myTicket.getAmount();
		if (amount > 0) {
			Random rand = new Random();
			amount = rand.nextInt(amount);
			System.out.print(name + " возвращает книгу ");
			if (amount < myTicket.booksAtHall.size())
				return myTicket.booksAtHall.remove(amount);
			return myTicket.booksAtHome.remove(amount - myTicket.booksAtHall.size());
		}
		return null;
	}
}

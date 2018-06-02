package com.maiseenok.second_homework.task7;

import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		int choice = -1;
		boolean success = false;
		ATM atm = new ATM(20, 20, 20);
		Scanner sc = new Scanner(System.in);

		System.out.print("Welcome to our ATM");
		while (choice != 3) {
			System.out.println("\nPress '1' if you need to get money\n" + "Press '2' if you need to set money\n"
					+ "Press '3' for exit");
			if (sc.hasNextInt())
				choice = sc.nextInt();
			else {
				System.out.println("Incorrect value");
				sc.next();
			}

			if (choice == 1) {
				System.out.print("\nYou want to get money");
				while (!success && choice != 0) {
					System.out.println("\nPlease, input sum that you need\n" + "Press '0' for exit");
					choice = sc.nextInt();
					if (choice != 0)
						success = atm.getMoney(choice);
				}
				success = false;
			}

			if (choice == 2) {
				System.out.println("\nYou want to set money\n" + "Please, input amount of 20, 50 and 100 notes");
				atm.setMoney(sc.nextInt(), sc.nextInt(), sc.nextInt());
				System.out.println(atm);
			}
		}
		sc.close();
		System.out.println(atm);
	}
}

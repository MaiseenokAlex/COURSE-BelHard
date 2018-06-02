package com.maiseenok.first_homework.task2;

import java.util.Random;

public class Runner {
	private static int numberGenerator() {
		return new Random().nextInt(2000);
	}

	private static boolean isThreeDigits(int number) {
		if (number > 99 && number < 1000)
			return true;
		return false;
	}

	private static boolean isLastSeven(int number) {
		if (number % 10 == 7)
			return true;
		return false;
	}

	private static boolean isEven(int number) {
		if (number % 2 == 0)
			return true;
		return false;
	}

	public static void main(String[] args) {
		int number = numberGenerator();
		System.out.println("Number = " + number);
		System.out.println("Three digits: " + isThreeDigits(number));
		System.out.println("Last Seven: " + isLastSeven(number));
		System.out.println("Even: " + isEven(number));
	}

}

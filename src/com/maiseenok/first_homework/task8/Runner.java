package com.maiseenok.first_homework.task8;

import java.util.Random;

public class Runner {
	private final static int NUMBER = new Random().nextInt(1000);

	public static void main(String[] args) {
		int n = NUMBER, i = 2;
		String str = " ";
		do {
			if (n % i == 0) {
				str = " not ";
				i = n;
			}
		} while (i++ < Math.sqrt(n));
		System.out.println("Number " + n + " is" + str + "a prime.");
	}
}

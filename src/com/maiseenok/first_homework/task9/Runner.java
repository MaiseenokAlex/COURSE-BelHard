package com.maiseenok.first_homework.task9;

import java.util.Random;

public class Runner {
	private final static int NUMBER = new Random().nextInt(50);

	public static void main(String[] args) {
		int sum = (3 + 3 * NUMBER) * NUMBER / 2;
		System.out.println("Sum of first " + NUMBER + " numbers that are divided by 3: " + sum);
	}
}

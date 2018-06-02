package com.maiseenok.first_homework.task7;

import java.util.Random;

public class Runner {
	private final static int NUMBER = 10 + new Random().nextInt(6);

	public static void main(String[] args) {
		long factorial = 1;
		for (int i = 2; i <= NUMBER; i++) {
			factorial *= i;
		}
		System.out.println(NUMBER + "! = " + factorial);
	}
}

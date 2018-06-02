package com.maiseenok.first_homework.task6;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Runner {
	private final static int NUMBER = 1000 + new Random().nextInt(9000);

	public static void main(String[] args) {
		int n = NUMBER;
		Set<Integer> digitsSet = new HashSet<Integer>();

		for (int i = 0; i < 4; i++) {
			digitsSet.add(n % 10);
			n /= 10;
		}

		System.out.println(NUMBER + " has " + digitsSet.size() + " different digits");
	}
}

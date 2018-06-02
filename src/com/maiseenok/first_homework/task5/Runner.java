package com.maiseenok.first_homework.task5;

import java.util.Random;

public class Runner {
	public static void main(String[] args) {
		int number = new Random().nextInt(9000) + 1000;
		int reverseNumber = Integer.parseInt(new StringBuffer(String.valueOf(number)).reverse().toString());
		System.out.println("Reverse of " + number + " is " + reverseNumber);
	}
}

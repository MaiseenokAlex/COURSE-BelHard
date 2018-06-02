package com.maiseenok.second_homework.task6;

public class Runner {
	public static void main(String[] args) {

		@SuppressWarnings("unused")
		String usualString = "";
		int concatTimes = 10000;
		StringBuilder stringBuilder = new StringBuilder();
		System.out.println("Program start");

		long nanoSec = System.nanoTime();
		for (int i = 0; i < concatTimes; i++)
			usualString += "a ";
		System.out.println("String cycle finished after " + (System.nanoTime() - nanoSec) + " nanoseconds");

		nanoSec = System.nanoTime();
		for (int i = 0; i < concatTimes; i++)
			stringBuilder.append("a ");
		System.out.println("StringBuilder cycle finished after " + (System.nanoTime() - nanoSec) + " nanoseconds");
	}
}

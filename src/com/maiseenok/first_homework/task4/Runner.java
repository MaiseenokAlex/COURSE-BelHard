package com.maiseenok.first_homework.task4;

public class Runner {
	public static void main(String[] args) {
		int moneySum = (int) (Math.random() * 100);
		int lastDigit = moneySum % 10;

		switch (lastDigit) {
		case 1:
		case 2:
		case 3:
		case 4:
			if (moneySum % 100 < 5 || moneySum % 100 > 14)
				if (lastDigit == 1) {
					System.out.println("В кармане " + moneySum + " рубль");
					break;
				} else {
					System.out.println("В кармане " + moneySum + " рубля");
					break;
				}
		default:
			System.out.println("В кармане " + moneySum + " рублей");
			break;
		}
	}
}

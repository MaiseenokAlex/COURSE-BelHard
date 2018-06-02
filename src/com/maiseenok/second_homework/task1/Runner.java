package com.maiseenok.second_homework.task1;

import java.util.Scanner;

public class Runner {
	private static int sum = 0;
	private static String str = "";
	private static StringBuilder sb = new StringBuilder();

	private static void scanProcessing() {
		Scanner sc = new Scanner(System.in);
		int value = 0;
		boolean check = false;
		do {
			char[] ch = str.toCharArray();
			for (int i = 0; i < ch.length; i++) {
				if (ch[i] >= '0' && ch[i] <= '9') {
					if (check)
						value *= 10;
					value += ch[i]-48;
					check = true;
				} else {
					sum += value;
					sb.append(ch[i]);
					check = false;
					value = 0;
				}
			}
			sum += value;
			str = sc.next();
		} while (!str.equals("quit"));
		sc.close();
	}

	public static void main(String[] args) {
		System.out.println("Input symbols (input 'quit' to quit):");
		scanProcessing();
		System.out.println("Sum: " + sum);
		System.out.println("String: " + sb.toString());
	}
}

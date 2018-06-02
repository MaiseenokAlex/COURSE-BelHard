package com.maiseenok.second_homework.task4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Runner {
	public static void main(String[] args) {
		String str;
		System.out.println("Input your text:");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();

		Pattern p = Pattern.compile("[.,:;?!)(\"-]");
		Matcher m = p.matcher(str);
		int marksCounter = 0;
		while (m.find()) {
			marksCounter++;
		}
		System.out.println(marksCounter + " punctuation marks were found");

		sc.close();
	}
}

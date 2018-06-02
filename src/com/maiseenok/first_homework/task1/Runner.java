package com.maiseenok.first_homework.task1;

import java.util.Random;

public class Runner {
	private static final int SECONDS_VALUE = 1000000;

	private static int getWeeks(int timeDays) {
		return timeDays / 7;
	}

	private static int getMinutes(int timeSeconds) {
		return timeSeconds / 60;
	}

	private static int getHours(int timeMinutes) {
		return timeMinutes / 60;
	}

	private static int getDays(int timeHours) {
		return timeHours / 24;
	}

	private static int getEntireSeconds(int time) {
		return time % 60;
	}

	private static int getEntireMinutes(int time) {
		return time % 60;
	}

	private static int getEntireHours(int time) {
		return time % 24;
	}

	private static int getEntireDays(int time) {
		return time % 7;
	}

	public static void main(String[] args) {
		int time = new Random().nextInt(SECONDS_VALUE);
		int seconds = getEntireSeconds(time);
		int minutes = getMinutes(time);
		System.out.println("Task A) " + time + " seconds is: " + minutes + " minutes and " + seconds + " seconds;");

		int hours = getHours(minutes);
		minutes = getEntireMinutes(minutes);
		System.out.println("Task B) " + time + " seconds is: " + hours + " hours, " + minutes + " minutes and "
				+ seconds + " seconds;");

		int days = getDays(hours);
		hours = getEntireHours(hours);
		System.out.println("Task C) " + time + " seconds is: " + days + " days, " + hours + " hours, " + minutes
				+ " minutes and " + seconds + " seconds;");

		int week = getWeeks(days);
		days = getEntireDays(days);
		System.out.println("Task D) " + time + " seconds is: " + week + " weeks, " + days + " days, " + hours
				+ " hours, " + minutes + " minutes and " + seconds + " seconds;");
	}
}

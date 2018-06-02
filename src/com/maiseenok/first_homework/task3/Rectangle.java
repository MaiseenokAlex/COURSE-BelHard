package com.maiseenok.first_homework.task3;

import java.util.Random;

public class Rectangle {
	private int a;
	private int b;

	public Rectangle() {
		a = numberGenerator();
		b = numberGenerator();
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	private int numberGenerator() {
		return new Random().nextInt(9) + 1;
	}

	public double getDiagonal() {
		return Math.hypot(a, b);
	}

	public String toString() {
		return "Side a = " + a + ", side b = " + b;
	}
}

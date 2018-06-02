package com.maiseenok.first_homework.task3;

import java.util.Random;

public class Circle {
	private double radius;

	public Circle() {
		radius = (new Random().nextDouble()) * 15;
	}

	public double getRadius() {
		return radius;
	}

	public String toString() {
		return "Circle's radius: " + String.format("%.2f", radius);
	}
}

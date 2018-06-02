package com.maiseenok.second_homework.task3;

import java.util.Scanner;

public class Runner {
	private static Scanner scanner = new Scanner(System.in);

	private static Circle getCircle() {
		Circle circle = new Circle();
		System.out.println("Input parameters");
		System.out.print("Radius (double): ");
		circle.setRadius(circle.checkDoubleInput(scanner));
		System.out.print("x-coordinate: ");
		circle.setX(circle.checkIntInput(scanner));
		System.out.print("y-coordinate: ");
		circle.setY(circle.checkIntInput(scanner));
		System.out.println("");
		return circle;
	}

	public static void main(String[] args) {

		Circle circle1 = getCircle();
		Circle circle2 = getCircle();
		System.out.println("First circle circumference: " + circle1.lengh());
		System.out.println("Distance between two circles: " + circle1.distance(circle2));

		if (circle1.touching(circle2))
			System.out.println("Circles have a point of contact");
		else
			System.out.println("Circles don't have a point of contact");

		circle2.randomMove();
		System.out.println("New circle position is (" + circle2.getX() + ", " + circle2.getY() + ")");
		scanner.close();
	}
}

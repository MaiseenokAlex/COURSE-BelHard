package com.maiseenok.second_homework.task3;

import java.util.Scanner;

public class Circle implements Cloneable {
	private int x;
	private int y;
	private double radius;

	public Circle() {
	}

	public double checkDoubleInput(Scanner sc) {
		boolean check = false;
		double val;
		while (!check)
			if (sc.hasNextDouble()) {
				val = sc.nextDouble();
				return val;
			} else {
				System.out.println("Incorrect value. Input parameter again");
				sc.next();
			}
		return 0;
	}

	public int checkIntInput(Scanner sc) {
		boolean check = false;
		int val;
		while (!check)
			if (sc.hasNextInt()) {
				val = sc.nextInt();
				return val;
			} else {
				System.out.println("Incorrect value. Input parameter again");
				sc.next();
			}
		return 0;
	}

	public double lengh() {
		return 2 * radius * Math.PI;
	}

	public void randomMove() {
		x = (int) (Math.random() * 200 - 100);
		y = (int) (Math.random() * 200 - 100);
	}

	public double distance(Circle circle) {
		return Math.hypot(x - circle.getX(), y - circle.getY());
	}

	public boolean touching(Circle circle) {
		double dist = distance(circle);
		if (dist > radius && dist > circle.getRadius()) {
			if (radius + circle.getRadius() == (int) dist)
				return true;
		} else {
			if (Math.abs(radius - circle.getRadius()) == dist)
				return true;
		}
		return false;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public double getRadius() {
		return radius;
	}
}

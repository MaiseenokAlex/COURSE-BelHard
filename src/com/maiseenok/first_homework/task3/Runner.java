package com.maiseenok.first_homework.task3;

public class Runner {
	private static boolean isCover(Rectangle rectangle, Circle circle) {
		double circleDiameter = 2 * circle.getRadius();
		if (circleDiameter > rectangle.getDiagonal())
			return true;
		return false;
	}

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		Circle circle = new Circle();

		System.out.println(rectangle);
		System.out.println(circle);

		if (isCover(rectangle, circle))
			System.out.println("You can cover this rectangle with the circle");
		else
			System.out.println("You can't cover this rectangle with the circle");
	}
}
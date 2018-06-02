package com.maiseenok.first_homework.task10;

public class Runner {
	private static void fillArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 8 + 3);
		}
	}

	private static void printArray(int[] array) {
		System.out.print("Marks: ");
		for (int i : array)
			System.out.print(i + " ");
	}

	private static void maxValuePosition(int[] array) {
		int maxValue = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maxValue) {
				maxValue = array[i];
			}
		}
		System.out.print("\nMax mark has position number: ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] == maxValue)
				System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		int[] marks = new int[15];

		fillArray(marks);
		printArray(marks);
		maxValuePosition(marks);

		System.out.println("\nFirst mark: " + marks[0]);
		System.out.println("Last mark: " + marks[marks.length - 1]);
	}
}

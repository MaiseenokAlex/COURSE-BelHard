package com.maiseenok.first_homework.task11;

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

	private static void reverseArray(int[] array) {
		int index;
		for (int i = 0; i < array.length / 2; i++) {
			index = array.length - 1 - i;
			array[i] += array[index];
			array[index] = array[i] - array[index];
			array[i] -= array[index];
		}
	}

	public static void main(String[] args) {
		int[] array = new int[10];
		fillArray(array);
		printArray(array);
		reverseArray(array);
		printArray(array);
	}
}

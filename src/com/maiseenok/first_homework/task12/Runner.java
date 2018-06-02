package com.maiseenok.first_homework.task12;

public class Runner {
	private final static int ARRAY_LENGTH = 15;

	private static void fillArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10 + 1);
		}
	}

	private static int parseMIN(int[] array) {
		int minValue = 100;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < minValue) {
				minValue = array[i];
			}
		}
		return minValue;
	}

	private static int parseMAX(int[] array) {
		int maxValue = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maxValue) {
				maxValue = array[i];
			}
		}
		return maxValue;
	}

	private static void printArray(int[] array) {
		System.out.print("Marks: ");
		for (int i : array)
			System.out.print(i + " ");
		System.out.println();
	}

	private static int[] minValuePosition(int[] array) {
		int[] minValuePositionArray = new int[ARRAY_LENGTH];
		int arg1 = 0;
		int minValue = parseMIN(array);
		for (int i = 0; i < array.length; i++) {
			if (array[i] == minValue) {
				minValuePositionArray[arg1++] = i;
			}
		}
		while (arg1 != ARRAY_LENGTH) {
			minValuePositionArray[arg1++] = -1;
		}
		return minValuePositionArray;
	}

	private static int[] maxValuePosition(int[] array) {
		int[] maxValuePositionArray = new int[ARRAY_LENGTH];
		int arg1 = 0;
		int maxValue = parseMAX(array);
		for (int i = 0; i < array.length; i++) {
			if (array[i] == maxValue) {
				maxValuePositionArray[arg1++] = i;
			}
		}
		while (arg1 != ARRAY_LENGTH) {
			maxValuePositionArray[arg1++] = -1;
		}
		return maxValuePositionArray;
	}

	public static void main(String[] args) {
		int[] array = new int[ARRAY_LENGTH];
		int minValue, maxValue;
		
		fillArray(array);
		printArray(array);
		minValue = parseMIN(array);
		System.out.print("Min value: " + minValue);
		maxValue = parseMAX(array);
		System.out.println(", Max value: " + maxValue);

		int[] minArr = minValuePosition(array);
		int[] maxArr = maxValuePosition(array);

		int sum = 0;
		String str = " ";
		for (int i = 0; i < minArr.length; i++) {
			for (int j = 0; j < maxArr.length; j++) {
				if (minArr[i] == -1 || maxArr[j] == -1)
					continue;
				
				if (minArr[i] < maxArr[j]) {
					for (int k = minArr[i]; k < maxArr[j]; k++) {
						sum += array[k];
						str += array[k] + "+";
					}
					str += array[maxArr[j]];
					System.out.println("Element sum:" + str + "=" + (sum + array[maxArr[j]]));
					str = " ";
					sum = 0;
				} else { 
					for (int k = maxArr[j]; k < minArr[i]; k++) {
						sum += array[k];
						str += array[k] + "+";
					}
					str += array[minArr[i]];
					System.out.println("Element sum:" + str + "=" + (sum + array[minArr[i]]));
					str = " ";
					sum = 0;
				}
			}
		}
	}
}

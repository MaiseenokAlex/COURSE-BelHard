package com.maiseenok.first_homework.task13;

public class Runner {
	private final static int DIMENTION = 9;

	private static void fillMatrix(int[][] matrix) {
		for (int i = 0; i <= DIMENTION / 2; i++)
			for (int j = 0; j <= DIMENTION / 2; j++) {
				if (i <= j) {
					matrix[i][j] = matrix[DIMENTION - i - 1][DIMENTION - j
							- 1] = matrix[i][DIMENTION - j - 1] = matrix[DIMENTION - i - 1][j] = 1;
				}
			}
	}

	private static void printMatrix(int[][] matrix) {
		for (int[] i : matrix) {
			for (int j : i)
				System.out.print(j + " ");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] matrix = new int[DIMENTION][DIMENTION];
		fillMatrix(matrix);
		printMatrix(matrix);
	}
}

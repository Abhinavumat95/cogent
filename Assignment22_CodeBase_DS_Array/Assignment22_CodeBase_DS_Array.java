package com.cogent.Assignment22_CodeBase_DS_Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class Assignment22_CodeBase_DS_Array {

	void print2DArray(int array[][]) {

		// Print 2D Array
		for (int[] r : array) {

			System.out.println(Arrays.toString(r));
		}
	}

	void add2Matrices(int array[][], int array1[][]) {

		// Add 2 Matrices
		int array2[][] = new int[3][3];
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				array2[i][j] = array[i][j] + array1[i][j];

		for (int[] r : array2) {

			System.out.println(Arrays.toString(r));
		}

	}

	void sort2DArray(int array[][]) {

		// Sort the 2D Array Across Columns
		Vector<Integer> vector = new Vector<>();

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				vector.add(array[j][i]);
			}

			Collections.sort(vector);

			for (int j = 0; j < 3; j++) {

				array[j][i] = vector.get(j);
			}

			vector.removeAll(vector);
		}

		System.out.println("Sorted 2d Array:");
		for (int[] r : array) {

			System.out.println(Arrays.toString(r));
		}
	}

	int matriceEqual(int array[][], int array1[][]) {

		// Check Whether Two Matrices Are Equal or Not
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				if (array[i][j] != array1[i][j]) {

					return 0;
				}
		return 1;

	}

	void transposeMatrice(int array[][]) {

		// Find the Transpose Matrice
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(" " + array[j][i]);
			}
			System.out.println();
		}

	}

	void matriceDeterminant(int array[][]) {

		// Find the Determinant of Matrice
		int x = (array[1][1] * array[2][2]) - (array[2][1] * array[1][2]);
		int y = (array[1][0] * array[2][2]) - (array[2][0] * array[1][2]);
		int z = (array[1][0] * array[2][1]) - (array[2][0] * array[1][1]);

		int d = (array[0][0] * x) - (array[0][1] * y) + (array[0][2] * z);

		System.out.println("The Determinant of the Matrice = " + d);

	}

	void normalAndTrace(int array[][]) {

		// Find the Normal and Trace of Matrice
		int s = 0;
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				s += (array[i][j] * array[i][j]);
		System.out.println("Normal = " + (int) Math.sqrt(s));

		int sum = 0;
		for (int i = 0; i < 3; i++)
			sum += array[i][i];
		System.out.println("Trace = " + sum);
	}

	void boundaryElements(int array[][]) {

		// Print Boundary Elements of a Matrice
		System.out.println("Boundary elements of the Matrice:");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				if (i == 0 || j == 0 || i == array.length - 1 || j == array[i].length - 1) {
					System.out.print(array[i][j]);
				} else {

					System.out.print(" ");
				}
			}

			System.out.println();
		}
	}

	void rotateMatrix(int array[][]) {

		// Rotate Matrix Elements

		int r = array.length;

		int c = array[0].length;

		int[][] rotatedArray = new int[r][c];

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				rotatedArray[i][j] = array[r - i - 1][c - j - 1];
			}
		}

		System.out.println("Rotated Matrix:");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(rotatedArray[i][j] + " ");
			}
			System.out.println();
		}

	}

	void sumOfDiagnols(int array[][]) {

		// Compute the Sum of Diagonals of a Matrix

		int d1 = array[0][0] + array[1][1] + array[2][2];
		int d2 = array[0][2] + array[1][1] + array[2][0];

		int sum = d1 + d2;
		System.out.println("Sum of diagonals of the matrix = " + sum);
	}

	void interchangeAcrossRows(int array[][]) {

		// Interchange Elements of First and Last in a Matrix Across Rows
		int rows = array.length;
		for (int i = 0; i < array[0].length; i++) {
			int t = array[0][i];
			array[0][i] = array[rows - 1][i];
			array[rows - 1][i] = t;
		}

		System.out.println("Interchanged matrix across rows:");
		for (int[] r : array) {

			System.out.println(Arrays.toString(r));
		}
	}

	void interchangeAcrossColumns(int array[][]) {

		// Interchange Elements of First and Last in a Matrix Across Columns
		for (int j = 0; j < 3; j++) {
			int temp = array[j][0];
			array[j][0] = array[j][3 - 1];
			array[j][3 - 1] = temp;
		}
		
		System.out.println("Interchanged matrix across columns:");
		for (int[] r : array) {

			System.out.println(Arrays.toString(r));
		}
	}
}

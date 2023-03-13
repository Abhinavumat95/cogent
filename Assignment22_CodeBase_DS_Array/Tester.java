package com.cogent.Assignment22_CodeBase_DS_Array;

public class Tester {

	public static void main(String[] args) {

		Assignment22_CodeBase_DS_Array c = new Assignment22_CodeBase_DS_Array();

		int array[][] = { { 12, 33, 4 }, { 65, 46, 77 }, { 18, 86, 101 } };
		c.print2DArray(array);
		System.out.println(":::::::::::::::::::");
		
		int array1[][] = { { 2, 3, 4 }, { 6, 4, 7 }, { 1, 8, 10 } };
		c.add2Matrices(array, array1);
		System.out.println(":::::::::::::::::::");
		
		c.sort2DArray(array);
		System.out.println(":::::::::::::::::::");
		
		int d = c.matriceEqual(array, array1);
		if (d == 0) {
			System.out.println("Matrices are not Identical");
		}else {
			System.out.println("Matrices are Identical");
		}
		System.out.println(":::::::::::::::::::");
	
		System.out.println("Transpose of the Matrice:");
		c.transposeMatrice(array);
		System.out.println(":::::::::::::::::::");

		c.matriceDeterminant(array);
		System.out.println(":::::::::::::::::::");
		
		c.normalAndTrace(array1);
		System.out.println(":::::::::::::::::::");
		
		c.boundaryElements(array1);
		System.out.println(":::::::::::::::::::");
		
		c.rotateMatrix(array1);
		System.out.println(":::::::::::::::::::");
		
		c.sumOfDiagnols(array1);
		System.out.println(":::::::::::::::::::");
		
		c.interchangeAcrossRows(array1);
		System.out.println(":::::::::::::::::::");
		
		c.interchangeAcrossColumns(array1);
		
	}

}

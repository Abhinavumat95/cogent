package com.cogent.CodeAssignment3;

public class Tester {

	public static void main(String[] args) {
		
		CodeAssignment3 c = new CodeAssignment3();
		
		c.removeChar("Abhinav", "a");
		
		System.out.println("::::::::::::::::::::");
		c.swapNum(3, 4);
		
		System.out.println("::::::::::::::::::::");
		c.removeWhiteSpace("Abhinav Umat Abhi       Umat");
		
		System.out.println("::::::::::::::::::::");
		System.out.println("Test 1:");
		int a[] = { 56, 78, 3 };
		int b[] = { 56, 78, 3 };
		c.compareArrays(a, b);
		System.out.println("Test 2:");
		int x[] = { 56, 78, 3 };
		int y[] = { 78, 3, 56 };
		c.compareArrays(x, y);
		
		System.out.println("::::::::::::::::::::");
		int z[] = {55, 23, 14, 8, 65, 128, 38};
		c.thirdLargestElement(z);
		
		System.out.println("::::::::::::::::::::");
		c.hashMapSort();
		
		System.out.println("::::::::::::::::::::");
		System.out.println("Test 1:");
		boolean B1 = c.balancedParentheses("[()]{}{[()()]()}");
		if (B1 == true) {
			System.out.println("It is Balanced");
		}else {
			System.out.println("It is not Balanced");
		}
		System.out.println("Test 2:");
		boolean B2 = c.balancedParentheses("[()]{{()(]()}");
		if (B2 == true) {
			System.out.println("It is Balanced");
		}else {
			System.out.println("It is not Balanced");
		}

	}

}

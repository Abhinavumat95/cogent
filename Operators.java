package com.cogent.basics;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1; //Assignment operator
		int b = 2;
		int c = a + b; //Arithmetic operator
		c++; //Unary operator
		int d = 5;
		System.out.println("c = " + c);
		System.out.println((c < d)); //Relational Operator
		System.out.println((a < b) && (c < d)); //Logical Operator
		
		//Ternary operator
		String r = (a < d) ? "a is less than d":"a is greater than d";
		System.out.println("r = " + r);
		
		// Bitwise operator
		int e = c | d;
		System.out.println("e = " + e);
		
		// Shift operator
		int f = 10;
		int Shift_f = f << 3;
		System.out.println("Shift_f = " + Shift_f);
	}

}

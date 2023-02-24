package com.cogent.CodeAssignment3;

import java.util.*;
import java.util.Map.Entry;

public class CodeAssignment3 {

	void removeChar(String str, String c) {

		// Remove All occurrences of given character from String
		String str1 = str.replaceAll(c, "");
		System.out.println("New String is: " + str1);
	}

	void swapNum(int a, int b) {

		// How to swap 2 numbers without using 3rd variable

		System.out.println("Here a = " + a + " and b = " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Now a = " + a + " and b = " + b);
	}

	void removeWhiteSpace(String str) {

		// How to remove white spaces from a string

		System.out.println("String before removing White Spaces: " + str);
		String str1 = str.replaceAll("\\s", "");
		System.out.println("String after removing White Spaces: " + str1);

	}

	void compareArrays(int a[], int b[]) {

		// Check if two arrays contains same elements

		boolean result = Arrays.equals(a, b);

		if (result == true) {
			System.out.println("Two arrays contains same elements");
		} else {
			System.out.println("Two arrays do not contains same elements");
		}
	}

	void thirdLargestElement(int a[]) {

		// Find 3rd largest element in an integer array
		int l = a.length;
		Arrays.sort(a);
		System.out.println("Third largest element in an integer array = " + a[l - 3]);
	}

	void hashMapSort() {

		// How to sort HashMap by using values
		HashMap<String, String> map = new HashMap<>();
		LinkedHashMap<String, String> sortedMap = new LinkedHashMap<>();
		ArrayList<String> list = new ArrayList<>();
		map.put("1", "Abhinav");
		map.put("2", "Abhi");
		map.put("3", "Navratan");
		map.put("4", "Harroop");
		map.put("5", "Harsh");
		map.put("6", "Ankit");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			list.add(entry.getValue());
		}
		Collections.sort(list, new Comparator<String>() {
			public int compare(String str, String str1) {
				return (str).compareTo(str1);
			}
		});
		for (String str : list) {
			for (Entry<String, String> entry : map.entrySet()) {
				if (entry.getValue().equals(str)) {
					sortedMap.put(entry.getKey(), str);
				}
			}
		}
		System.out.println(sortedMap);
	}

	boolean balancedParentheses(String str) {

		// Write a java code to check balanced parentheses in an expression using stack

		Deque<Character> stack = new ArrayDeque<Character>();

		for (int i = 0; i < str.length(); i++) {
			char x = str.charAt(i);

			if (x == '(' || x == '[' || x == '{') {

				stack.push(x);
				continue;
			}

			if (stack.isEmpty())
				return false;
			char check;
			switch (x) {
			case ')':
				check = stack.pop();
				if (check == '{' || check == '[')
					return false;
				break;

			case '}':
				check = stack.pop();
				if (check == '(' || check == '[')
					return false;
				break;

			case ']':
				check = stack.pop();
				if (check == '(' || check == '{')
					return false;
				break;
			}
		}

		return (stack.isEmpty());
	}

}

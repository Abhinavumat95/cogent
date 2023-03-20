package com.cogent.Assignment26CodeDS;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.w3c.dom.Node;

public class Assignment26 {

	void reverseString(String a) {

		// Reverse string in java Program
		StringBuilder str = new StringBuilder(a);
		str.reverse();
		System.out.println("Reverse of String " + a + " is " + str);
	}

	void fibonacciSequence(int n) {

		// Print a Fibonacci sequence using recursion
		int a = 1;
		int b = 1;
		int c;
		System.out.println("Fibonacci Sequence is as follows:");
		System.out.println(a);
		System.out.println(b);
		for (int i = 0; i < (n - 2); i++) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
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

	void distinctCharacters(String str) {

		// Distinct characters in a String

		int count = 1;
		List<Character> chars = new ArrayList<Character>();
		chars.add(str.charAt(0));
		for (int i = 1; i < str.length(); i++) {
			if (chars.contains(str.charAt(i))) {
				continue;

			} else {
				count = count + 1;
				chars.add(str.charAt(i));
			}

		}

		System.out.println("Count of distinct characters = " + count);
	}

	void diamondProblem() {

		// How do you show a diamond problem with multiple inheritance in Java

		// The solution to the diamond problem is default methods and interfaces. We can
		// achieve multiple inheritance by using these two things.

		// The default method is similar to the abstract method. The only difference is
		// that it is defined
		// inside the interfaces with the default implementation. We need not to
		// override these
		// methods. Because they are already implementing these interfaces.

		// The advantage of interfaces is that it can have the same default methods with
		// the same name and
		// signature in two different interfaces. It allows us to implement these two
		// interfaces, from a class.
		// We must override the default methods explicitly with its interface name.
	}

	void numberOfDigits(int n) {

		// Write a program in Java to count the digits in a number

		int count = 0;
		for (; n != 0; n /= 10, ++count) {
		}

		System.out.println("Number of digits = " + count);
	}

	void toggleCase(String str) {

		// Write a program in Java to Toggle the case of every character of a string

		String str1 = "";
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i)))
				str1 = str1 + Character.toLowerCase(str.charAt(i));
			else
				str1 = str1 + Character.toUpperCase(str.charAt(i));
		}
		System.out.println("Toggled String for String " + str + " = " + str1);
	}

	void removeDuplicate() {

		// Java program to remove duplicate elements from Singly Linked List
		class Node {

			Node next;
			String data;

			public Node(String data) {
				super();
				this.data = data;
			}

		}
		Node head = new Node("1");
		head.next = new Node("2");
		head.next.next = new Node("3");
		head.next.next.next = new Node("2");
		head.next.next.next.next = new Node("5");
		head.next.next.next.next.next = new Node("1");
		head.next.next.next.next.next.next = new Node("6");

		Node prevNode = head;
		Node currNode = head.next;
		Node temp = null;

		Map<String, Integer> map = new HashMap<>();

		map.put(prevNode.data, 1);

		while (currNode != null) {

			if (map.containsKey(currNode.data)) {
				temp = currNode;
				prevNode.next = currNode.next;
				currNode = currNode.next;
				temp = null;
			} else {
				map.put(currNode.data, 1);
				prevNode = currNode;
				currNode = currNode.next;
			}

		}
		Node n = head;
		System.out.println("Linked List after removing duplicates:");
		while (n != null) {
			System.out.print("->" + n.data);
			n = n.next;
		}
	}
}
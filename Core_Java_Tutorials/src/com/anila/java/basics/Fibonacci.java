package com.anila.java.basics;

public class Fibonacci {
	public static void main(String args[]) {
		int number = 8;
		int number1 = 0;
		int number2 = 1;
		int temp = 1;
		System.out.println(number1);
		System.out.println(number2);
		while (number != 0) {
			temp = number1 + number2;
			number1 = number2;
			number2 = temp;
			System.out.println(temp);
			number--;
		}
	}
}

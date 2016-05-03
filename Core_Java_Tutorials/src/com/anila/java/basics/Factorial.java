package com.anila.java.basics;

public class Factorial {
	public static void main(String args[]) {
		int number = 5;
		int factorial = 1;
		int temp = 1;
		while (temp <= number) {
			factorial = factorial * temp;
			temp++;
		}
		System.out.println(factorial);
	}
}

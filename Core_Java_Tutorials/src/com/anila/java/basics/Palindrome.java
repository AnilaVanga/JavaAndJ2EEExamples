package com.anila.java.basics;

public class Palindrome {

	public static void main(String[] args) {
		int number = 4554;
		int temp1 = 0, r = 0, rev = 0;
		temp1 = number;
		while (temp1 != 0) {
			r = temp1 % 10;
			temp1 = temp1 / 10;
			rev = rev * 10 + r;
		}
		if (rev == number) {
			System.out.println("palindrome number");
		} else {
			System.out.println("Not Palindrome number");
		}

	}
}

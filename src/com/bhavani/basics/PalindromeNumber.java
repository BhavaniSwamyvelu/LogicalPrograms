package com.bhavani.basics;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check");
		int iVal = sc.nextInt();
		int temp, rem;
		int rev = 0;
		temp = iVal;
		while (iVal > 0) {
			rem = iVal % 10;
			rev = rev * 10 + rem;
			iVal = iVal / 10;
		}
		if (temp == rev) {
			System.out.println("Palindrome Number");
		} else {
			System.out.println("not a palindrome number");
		}
	}

}

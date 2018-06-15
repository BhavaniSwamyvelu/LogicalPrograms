package com.bhavani.basics;

public class Factorial {

	public static void main(String[] args) {
		int nVal = 5;
		int fact = 1;
		for (int iVal = 1; iVal <= nVal; iVal++) {
			fact = fact * iVal;
		}
		System.out.println(fact);

	}
}

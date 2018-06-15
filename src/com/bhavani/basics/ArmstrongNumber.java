package com.bhavani.basics;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int iVal = 371;
		int temp, rem;
		int sum = 0;
		temp = iVal;
		while (iVal > 0) {
			rem = iVal % 10;
			iVal = iVal / 10;
			sum = sum + (rem * rem * rem);
		}
		if (temp == sum) {
			System.out.println("Armstrong number");
		} else {
			System.out.println("not a Armstrong number");
		}
	}
}

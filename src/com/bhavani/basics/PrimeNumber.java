package com.bhavani.basics;

public class PrimeNumber {
	public static void main(String[] args) {
		int aValue = 20;
		int mValue;
		mValue = aValue / 2;
		for (int i = 2; i <= mValue; i++) {
			// if(aValue=0 || aValue=1){
			// System.out.println("Not a prime number");
			// }
			if (mValue % i == 0) {
				System.out.println("Not a prime number");
				break;
			} else {
				System.out.println("prime number");
			}
		}

	}
}
package com.bhavani.basics;

public class SwapNumbers2 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping" + "\t" + a + "\t" + b);

	}

}

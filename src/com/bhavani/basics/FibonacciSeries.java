package com.bhavani.basics;

public class FibonacciSeries {
	public static void main(String[] args) {
		int n = 5;
		int x = 0;
		int y = 1;
		System.out.println(0 + "\n" + 1);
		for (int i = 2; i <= n; i++) {
			int z = x + y;
			System.out.println(z);
			x = y;
			y = z;
		}
		// System.out.println(x + "\n" + y);
	}

}

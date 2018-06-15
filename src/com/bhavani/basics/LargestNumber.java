package com.bhavani.basics;

public class LargestNumber {
	static int largNum(int[] a, int n) {
		int i;
		int m = 0;
		for (i = 0; i < n; i++) {
			if (a[i] > m) {
				m = a[i];
			}
		}
		return m;
	}

	public static void main(String[] args) {
		int[] a = { 10, 20, 35, 65, 2 };
		int n = 5;
		int result = largNum(a, n);
		System.out.println(result);
	}
}

package com.group;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Fibonacci sequence

		int num = 0;

		int[] fib = new int[10];

		for (int i = 0; i < 10; i++) {

			if (i == 1) {

				num = 1;
			}

			else if (i != 0) {

				num = fib[i - 1] + fib[i - 2];
			}

			fib[i] = num;

		}

		for (int el : fib) {

			System.out.print(el + " ");
		}

	}

}

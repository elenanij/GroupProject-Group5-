package com.group;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = {

				{ 3, 6, 95, 7, 17, 23, 34 }, { 5, 9, 8, 36, 76, 90, 21 } };

		int sumOdd = 0;
		int sumEven = 0;

		for (int[] row : arr) {

			for (int num : row) {

				if (num % 2 == 0) {

					sumEven += num;
				}

				else {

					sumOdd += num;
				}
			}
		}

		System.out.println("Odd numbers sum is " + sumOdd + " and even numbers sum is " + sumEven);

	}

}

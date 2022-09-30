package com.group;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		String[][] countries = { { "Algeria", "France", "Egypt", "Spain", "USA", "Italy" },
				{ "Algeirs", "Paris", "Cairo ", "Madrid", "Washington DC", "Rome" }, };

		System.out.println("What country would you like to visit?");

		for (int k = 0; k < countries[0].length; k++) {

			String input = scanner.next();

			int i = 0;

			for (String country : countries[0]) {

				if (input.equals(country)) {
					System.out.println("The capital of " + country + " is " + countries[1][i]);
					break;
				}

				i++;

			}

		}
	}

}

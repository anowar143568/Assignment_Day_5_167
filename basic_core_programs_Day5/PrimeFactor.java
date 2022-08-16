package com.bridgelabz.basic_core_programs_Day5;

import java.util.Scanner;

public class PrimeFactor {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to find prime factors");
		int number = input.nextInt();

		for (int i = 2; i < number; i++) {
			while (number % i == 0) {
				System.out.println(i + " ");
			number = number / i;
			}
		}
		if (number > 2)
			System.out.println(number);
	}

}

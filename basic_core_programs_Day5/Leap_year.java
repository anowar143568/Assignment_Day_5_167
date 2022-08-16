package com.bridgelabz.basic_core_programs_Day5;

import java.util.Scanner;

public class Leap_year {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value of year Here : ");
		int year = input.nextInt();

		if ((year % 4 == 0) && (year % 100 == 0) || (year % 400 == 0 && year > 1523)) {
			System.out.println(" The year is a leap year");
		} else {
			System.out.println("The year is not a leap year");
		}
	}

}

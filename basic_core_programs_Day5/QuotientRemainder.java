package com.bridgelabz.basic_core_programs_Day5;

import java.util.Scanner;

public class QuotientRemainder {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value of the divisor: ");
		int divisor = input.nextInt();

		System.out.print("Enter the value of the divident: ");
		int divident = input.nextInt();

		int quo = divident / divisor;
		int rem = divident / divisor;
		System.out.println(" When " + divisor + " is divided by " + divident + " then the quotient is " + quo
				+ "  & the remainder is " + rem + ".");

	}

}

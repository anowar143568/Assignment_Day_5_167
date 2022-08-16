package com.bridgelabz.basic_core_programs_Day5;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value here :");
		int x = input.nextInt();

		if (x % 2 == 0) {
			System.out.println("The number is even :" + x);
		} else {
			System.out.println("The number is odd : " +x);
		}

	}

}

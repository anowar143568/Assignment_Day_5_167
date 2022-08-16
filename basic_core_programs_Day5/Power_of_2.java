package com.bridgelabz.basic_core_programs_Day5;

import java.util.Scanner;

public class Power_of_2 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the value of base: ");
		int base = input.nextInt();

		System.out.print("Enter the value of exponent: ");
		int exponent = input.nextInt();

		int result= 1;
		
		for (int i = 1; i <= exponent; i++) {
			result=result*base;
		}
		System.out.println("The value of power is :" + (result));

	}
}

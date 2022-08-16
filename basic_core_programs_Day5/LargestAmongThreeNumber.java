package com.bridgelabz.basic_core_programs_Day5;

import java.util.Scanner;

public class LargestAmongThreeNumber {

	public static void main(String[] args) {
		
		   int num1, num2, num3;
	        Scanner input = new Scanner(System.in);
	        System.out.println("Enter 1st no.");
	        num1 = input.nextInt();
	        System.out.println("Enter 2nd no.");
	        num2 = input.nextInt();
	        System.out.println("Enter 3rd no.");
	        num3 = input.nextInt();
	        if (num1 > num2 && num1 > num3) {
	            System.out.print(+num1+ " is biggest among them.");
	        } else if (num2 > num1 && num2 > num3) {
	            System.out.print(+num2+ " is biggest among them.");
	        } else {
	            System.out.print(+num3+ " is biggest among them.");
	        }
		
		
	}
}

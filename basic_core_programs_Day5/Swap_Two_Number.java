package com.bridgelabz.basic_core_programs_Day5;

import java.util.Scanner;

public class Swap_Two_Number {

	public static void main(String[] args) {

		int z;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of X");
		int x = input.nextInt();
		System.out.println("Enter the value of y");
		int y = input.nextInt();
		System.out.println("before swapping " + x + ", " + y);
		z = x;
		x = y;
		y = z;
		System.out.println("After swapping: " + x + ", " + y);
 
	}

}

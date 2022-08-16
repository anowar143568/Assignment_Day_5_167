package com.bridgelabz.java_fundamentals;

//import java.util.Random;

public class Creat_a_random_number {

	public static void main(String[] args) {

//		Random input = new Random();
//		System.out.print("Enter the value of the dice number here :");
//		int dice= input.nextInt();
//		
//			for (int i=0;i<=100;i++) {
//			System.out.println(Math.random());
//		}

		int var = 1;
		double employeeCheck = Math.floor(Math.random() * 1005) % 2;
		// System.out.println(var);

		if (employeeCheck == var) {
			System.out.println("The employee is present");

		} else {
			System.out.println("Employee is absent");
		}
	}

}

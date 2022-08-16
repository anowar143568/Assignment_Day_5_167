package com.bridgelabz.java_fundamentals;

//import java.util.Scanner;

public class Employee_attendence {

	public static void main(String[] args) {
//		
//		Scanner input =new Scanner (System.in);
//		System.out.print(" Enter the string here :");
//		String employee = input.next();
//		

		int var = 1;
		double employeeCheck = Math.floor(Math.random() * 10) % 2;

		if (employeeCheck == var) {
			System.out.println("The employee is present");

		} else {
			System.out.println("Employee is absent");
		}
	}

}

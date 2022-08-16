package com.bridgelabz.basic_core_programs_Day5;

import java.util.Scanner;

public class Vowel_Consonent {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the alphabet here :");
		char alphabet = input.next().charAt(0);
		
	
		
		switch(alphabet) {
		case 'a':
			System.out.println("This is a vowel");
			break;
		case 'e':
			System.out.println("This is a vowel");
			break;	
		case 'i':
			System.out.println("This is a vowel");
			break;
		case 'o':
			System.out.println("This is a vowel");
			break;
		case 'u':
			System.out.println("This is a vowel");
			break;
		default:
			System.out.println("The letter is consonent ");
			break;
		}
		
		
		
		
	}

}

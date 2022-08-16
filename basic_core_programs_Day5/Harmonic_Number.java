package com.bridgelabz.basic_core_programs_Day5;

public class Harmonic_Number {

	public static void main(String[] args) {

		int i;
		double result =0;
		int N = 5;

		for ( i = 1; i <=N; i++) {

			System.out.print("1/" +i+ " + " );

			result = result + (double) 1 / i;
			
		}
		System.out.println();
		System.out.println("Teh sum of the harmonic series is : " +result);
	}

}

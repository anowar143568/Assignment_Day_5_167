package com.bridgelabz.basic_core_programs_Day5;

import java.util.Scanner;

public class Coin_flip {

	public static void main(String[] args) {

		int head = 0;
		int tail = 0;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value of count here : ");
		int count = input.nextInt();

		if (count > 0) {
			for (int i = 1; i <= count; i++) {
				double random = Math.random();
				if (random < .5) {
					tail=tail+1;
				} else {
					head=head+1;
				}
			}
			double headPercent = (head * 100) / (head + tail);
			double tailPercent = 100 - headPercent;
			System.out.println("After " + count + " flips, \n No. of heads is " + head + ". \n No. of tails is " + tail
					+ ". \n Head Percentage is " + headPercent + ". \n Tail percentage is " + tailPercent + ".");

		} else {
			System.out.println("Enter a positive integer number");
		}

	}

}

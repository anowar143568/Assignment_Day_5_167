package com.bridgelabz.basic_core_programs_Day5;

public class Array_2D {

	public static void main(String[] args) {

//		int [][] arr1 =new int[2][3];
//		
//		arr1[0][0]=1;
//		arr1[0][1]=2;
//		arr1[0][2]=3;
//		arr1[1][0]=3;
//		arr1[1][1]=4;
//		arr1[1][2]=5;
//		arr1[2][0]=4;
//		arr1[2][1]=6;
//		arr1[2][2]=8;
		

		System.out.println("inline 2D");
		int[][] arr1 = { { 1, 2, 3 }, { 3, 4, 5 }, { 4, 6, 8 } };
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
				
			}
			System.out.println();
		}
	}
}

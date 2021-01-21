package com.Training.org;

import java.util.Scanner;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		twoDimension();
	}

	public static void twoDimension() {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[2][4];

//		first row
//		arr [0][0] =2;
//		arr [0][1] =4;
//		second row
//		arr [1][0] =6;
//		arr [1][1] =8;

		int rowLegth = arr.length;
		int columnLenght = arr[0].length;
		for (int row = 0; row < rowLegth; row++) {
			for (int column = 0; column < columnLenght; column++) {
				System.out.println("Enter the value to add to the Array");
				arr[row][column] = sc.nextInt();
			}
		}
		System.out.println("The two dimensional array is :");
		
		for (int row = 0; row < rowLegth; row++) {
			for (int column = 0; column < columnLenght; column++) {
				System.out.println(arr[row][column]);
			}
		}
	String s= new String("Lokesh");
	System.out.println(s.length());
		String n ="karan";
		System.out.println(n.length());
		

	}

}

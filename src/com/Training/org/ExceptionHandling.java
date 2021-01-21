package com.Training.org;

import java.util.Scanner;

public class ExceptionHandling {
	public static void doing() throws MyException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int nextInt = sc.nextInt();
		
		int a= nextInt;
		if (a<20) 
		{
			throw new MyException("The age should be above 20");
		}
		else {
			System.out.println(" the entered age is above 20 , so you can vote");
		}

	}
	public static void main(String[] args) throws MyException {
		doing();
	}

}


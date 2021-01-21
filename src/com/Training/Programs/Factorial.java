package com.Training.Programs;

public class Factorial {
 
	public static void main(String[] args) {
		isFactorial(4);
	}
	public static void isFactorial(int num) {
		int temp=1;
		for(int a=num;a>0;a--) {
			temp=temp*a;
		}
		System.out.println(temp);

	}
	
}

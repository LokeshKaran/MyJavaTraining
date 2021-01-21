package com.Training.Programs;

public class ProgrammingTest {
	public static void main(String[] args) {
//		isArmstrongNumber(154);
//		isPalindroneNumber(242);
//		isFibonacciSeries();
		isFactorialNumber(3);
		

	}

	public static void isArmstrongNumber(int num) {
		// int num =153;
		int temp = num;
		int r = 0;
		int cube = 0;
		while (temp > 0) {
			r = temp % 10;
			cube = cube + (r * r * r);
			temp = temp / 10;
		}
		if (num == cube) {
			System.out.println("the numer is the Armstrong number");
		} else {
			System.out.println("the number is not the Armstrong number, try some other number");
		}

	}

	public static void isPalindroneNumber(int num) {
		// int num =151;
		int temp = num;
		int r = 0;
		int rev = 0;
		while (temp > 0) {
			r = temp % 10;
			rev = (rev * 10) + r;
			temp = temp / 10;
		}
		if (num == rev) {
			System.out.println("the number is the Palindrone number");

		} else {
			System.out.println("the number is not the palindrone number");
		}

	}
	
	public static void isFibonacciSeries() {
		int a=0;
		int b=1;
		int c;
		for (int i = 0; i < 10; i++) {
			c=a+b;
			a=b;
			b=c;
			
			System.out.println(c);
		}
		
	}
	public static void isFactorialNumber(int num ) {
		int temp =1;
		for (int i = num; i>0; i--) {
			temp = temp*i;
			
		}
		System.out.println(temp);

	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

package com.Training.Programs;

public class PalindroneNumberDemo {
	public static void main(String[] args) {
	isPalindroneNumber(34543);
	}
	public static void isPalindroneNumber(int num) {
		int temp=num;
		int r=0;
		int rev=0;
		while(temp>0) {
			r=temp%10;
			rev=(rev*10)+r;
			temp=temp/10;
		}
		if (num==rev) {
			System.out.println("the number is the palindrone number");
			
		}
		else {
			System.out.println("the number is not the palindrone number");
		}

	}

}

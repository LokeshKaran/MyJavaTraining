package com.Training.Programs;

public class StringReversal {
	public static void main(String[] args) {
		isReversal();
		System.out.println();
		ispalindroneNUmber(151);
		isArmstrongNumber(153);
		isFibonacciSeries(20);
		isfactorial(5);
		
	}
	public static void isReversal() {
		String actual = "Welcome to java";
		String[] split = actual.split(" ");
		int length = split.length;
		System.out.println("the length of the string is :"+length);
		for(int a=0;a<=length-1;a++) {
			System.out.print(" ");
			String[] split2 = split[a].split("");
			 for(int b=split2.length-1;b>=0;b--) {
				 System.out.print(split2[b]);
			 }
		}
		
	}
	public static void ispalindroneNUmber(int num) {
		int temp = num;
		int r=0;
		int rev=0;
		while(temp>0) {
			r=temp%10;
			rev=rev*10+r;
			temp=temp/10;
		}
		if(num==rev) {
			System.out.println("the number is the palindrone number");
		}else {
			System.out.println("the number is not the palindrone number");
		}
	}
	public static void isArmstrongNumber(int num) {
		int temp=num;
		int r;
		int cube = 0;
		while(temp>0) {
			r=temp%10;
			cube=cube+(r*r*r);
			temp=temp/10;
		}
		if(cube==num) {
			System.out.println("the number is the Armstrong number");
		}
		else {
			System.out.println("the number is not the Armstrong number");
		}
	}
	public static void isFibonacciSeries(int n) {
		int a=0;
		int b=1;
		int c=0;
		
		while(c<n) {
			c=a+b;
			System.out.print(","+c);
			a=b;
			b=c;
		}
		
	}
	public static void isfactorial(int num) {
		int temp=1;
		for(int a=num;a>0;a--) {
			temp=temp*a;
		}
		System.out.println();
		System.out.println(temp);
	}

}

package com.Training.Programs;

public class SwappingNumberDemo {
	public static void main(String[] args) {
//		withThirdVariable();
		withoutTHirdVariable();
		
	}
	public static void withThirdVariable() {
		int a=10;
		int b=20;
		int c=0;
		System.out.println("a-->"+a);
		System.out.println("b-->"+b);
		c=a;
		a=b;
		b=c; 
		System.out.println("After swapping the number the value is");
		System.out.println("a-->"+a);
		System.out.println("b-->"+b);
	}
	public static void withoutTHirdVariable() {
		int a=10;
		int b=20;
		System.out.println("a-->"+a);
		System.out.println("b-->"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping the number the value is");
		System.out.println("a-->"+a);
		System.out.println("b-->"+b);
		

	}

}

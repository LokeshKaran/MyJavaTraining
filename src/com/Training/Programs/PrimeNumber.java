package com.Training.Programs;

public class PrimeNumber {
	public static void main(String[] args) {
		boolean prime = isPrime(4);
		if(prime==true) {
			System.out.println("the number is the prime number");
		}else
			System.out.println("the number is not the prime number");
		checkingPrime(20);
		
	}

	public static boolean isPrime(int num) {
		if(num<=1) {
			return false;
			 
		}else 
		for(int a=2;a<num;a++) {
			if(num%a==0 && !(num==2)) {
				return false;
			}
			
		}
		return true;

	}
	public static void checkingPrime(int num) {
		for(int i=2;i<num;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
			
		}

	}
}

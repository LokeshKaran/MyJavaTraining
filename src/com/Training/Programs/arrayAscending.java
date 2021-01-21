package com.Training.Programs;

public class arrayAscending {
	public static void main(String[] args) {
//		isAscending();
		isPrime(-1);

	}

	public static void isAscending() {
		int num[] = { 2, 20, 10, 1, 78, 98 };
		int lengthOfArray = num.length;
		for (int a = 0; a < lengthOfArray; a++) {
			for (int b = a + 1; b < lengthOfArray; b++) {
				if (num[a] > num[b]) {
					{
						num[a] = num[b];
					}

				}
			}
		}
		for (int j = 0; j < lengthOfArray; j++) {
			System.out.println(num[j]);
		}

	}

	public static void isPrime(int num) {
		int temp = num;
		int count = 0;
		if (temp > 1) {
			for (int a = 2; a < num; a++) {
				if (temp % 2 == 0) {
					count = 1;
				}
			}
			if (count == 1) {
				System.out.println("the number is not the prime number");
			} else {
				System.out.println("the number is the prime number");
			}
		}else {
			System.out.println("The number is not the prime number");
		}

	}

}

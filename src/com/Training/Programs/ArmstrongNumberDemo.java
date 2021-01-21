package com.Training.Programs;

import java.util.Scanner;

public class ArmstrongNumberDemo {
	 public static void main(String[] args) {
		 isArmstrong();
		
	 }
	public static void isArmstrong() {
		 int num = 153;
			int temp=num;
			int r;
			int cube = 0;
			while(num>0) {
				r=num%10;
				cube=cube+(r*r*r);
				num=num/10;
				
			}
			if (cube==temp) {
				System.out.println("the number is the Armstrong number");
			}
			else {
				System.out.println("the number is not the Armstrong number");
			}
	}
}

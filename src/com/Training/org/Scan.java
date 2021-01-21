package com.Training.org;

import java.util.Scanner;

public class Scan {
	
	public Scan(String boss) {
		System.out.println(" the name of the master is :"+boss);
	}

public static void main(String[] args) {
	Scan scc = new Scan("Lokesh Mass");
	Scanner sc = new Scanner(System.in);
	System.out.println(" Enter the name :");
	String ss = sc.next();
	System.out.println(" the entered name is :"+ss);
	String n = sc.nextLine();
	System.out.println(" the last name is :"+n);
	System.out.println(" Enter the age :");
	int age = sc.nextInt();
	System.out.println(" the entered age is :"+age);
}
}

package com.Training.org;

import java.util.Scanner;

public class StringClass {
	public static void main(String[] args) {
		reverseString();
	}
	
	public static void reverseString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("provide the sting input or type your name");
		String name = sc.nextLine();
		System.out.println(name);
		String[] nameSplit = name.split("");
		int lenghtOfName = nameSplit.length;
		System.out.println(lenghtOfName);
		
		for(int a=lenghtOfName-1;a>=0;a--) {
			
			System.out.print(nameSplit[a]);
		}		
	}
	
	public static void duplicateString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string value to find the duplicate");
		String stringValue = sc.nextLine();
		System.out.println("the entered value is-"+stringValue);
		String charArray[] = stringValue.split("");
		int size=charArray.length;
		System.out.println(size);
		
		String duplicate[]=null;
		
		
		for(int a=0;a<size;a++) {
			duplicate[a]=charArray[a];
			
			
			
			
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void stringMethods() {
		String name = " My name is Lokesh ";
		int length = name.length();
		System.out.println(length);
		char cha = name.charAt(5);
		System.out.println(cha);
		String n ="name";
		boolean contains = name.contains(n);
		System.out.println(contains);
		boolean equals = name.equals("  my name is lokesh ");
		System.out.println(equals);
		boolean equalsIgnoreCase = name.equalsIgnoreCase("  my name is lokesh ");
		System.out.println(equalsIgnoreCase);
		String upperCase = name.toUpperCase();
		System.out.println(upperCase);
		String lowerCase = name.toLowerCase();
		System.out.println(lowerCase);
		boolean startsWith = name.startsWith(" ");
		System.out.println(startsWith);
		boolean endsWith = name.endsWith(" ");
		System.out.println(endsWith);
		int indexOf = name.indexOf('L');
		System.out.println(indexOf);
		int lastIndexOf = name.lastIndexOf("L");
		System.out.println(lastIndexOf);
		String substring = name.substring(5,8);
		System.out.println(substring);
		String replace = name.replace('e', 'E');
		System.out.println(replace);
		String trim = name.trim();
		System.out.println(trim);
		String[] split = trim.split(" ");
		int length2 = split.length;
		System.out.println(length2);
		for(int i=0;i<split.length;i++)
		{
			System.out.println(split[i]);
		}
	}
}


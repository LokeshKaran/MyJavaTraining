package com.Training.org;

public class ReturnDemo {
	 
	public static void main(String[] args) {
		ReturnDemo rn = new ReturnDemo();
		int adding = rn.adding(10, 30);
		System.out.println(adding);
		
	}
	public int adding(int a,int b) {
		int c=a+b;
		//System.out.println(c);
		return c;

	}

}

package com.Training.org;

import com.Training.org.StaticClass.Boss;

public class StaticClass {
	public static void sub() {
		System.out.println("the number are being subtracted");

	}
	public void mul() {
			System.out.println("the number are being multiplied");

	}
	public static  class Boss{	
		public static void add(int a) {
			System.out.println("the addition of two umbers is "+a);
		}
		private void div() {
			System.out.println("the number are being divided");

		}
	}
	static int b = 34;
	public static void main(String[] args) {
		StaticClass.Boss st = new StaticClass.Boss();
		StaticClass ss= new StaticClass();
			Boss.add(26);
			sub();
			System.out.println(b);
			ss.mul();
			st.div();
	}
	static {
		System.out.println("the ststic block number is 1");
	}
	
	static {
		System.out.println("the static block number is 2");
	}
	
}

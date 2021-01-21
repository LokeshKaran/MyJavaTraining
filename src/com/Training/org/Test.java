package com.Training.org;

public class Test {
	public static void main(String[] args) {
		Test prac = new Test();
		prac.lok(78,43);
		prac.di('d');
		prac.goa("who");
		prac.goa("how", 65);
		Test bala = new Test();
		bala.di('s');
		bala.goa("goa is the best place to go ");
		bala.goa("icecream", 26);
		
		
	}
	
	private void lok(int a, int b) {
		System.out.println(a);
		System.out.println(b);
		
	}
	private void di(char h) {
	
		System.out.println(h);
	}
	public void goa(String s) {
		System.out.println(s);
	}
	private void goa(String b,int d) {
		System.out.println(b +"  "+ d);

	}
	
	
}

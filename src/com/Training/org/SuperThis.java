package com.Training.org;

public class SuperThis extends FinalClass {
	int aa =10;
	private void ran(int aa) {
			System.out.println("the valus of the mathod is :"+super.aa);

	}
	public static void main(String[] args) {
		SuperThis th = new SuperThis();
		th.ran(100);
	}

}

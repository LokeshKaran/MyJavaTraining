package com.Training.org;

public class Testing {
	
	public static void main(String[] args) {
		System.out.print("Lokesh");
		Testing test = new Testing();
		test.search('D');
		test.search(26,"Boost");
	}
	private void search(char h) {
		System.out.println(" "+h);
	}
	private void search(int h, String g) {
		System.out.print("the age of Lokesh D ");
		System.out.println(h);
		System.out.println(g);
		System.out.println();
	}

}
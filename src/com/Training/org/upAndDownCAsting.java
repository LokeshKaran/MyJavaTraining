package com.Training.org;

public class upAndDownCAsting {
	public static void main(String[] args) {
	Parent p = new Child();
	Child c = (Child)p;
	p.method();
	System.out.println(p.name);
	c.method();
	System.out.println(c.w);
	p.anotherParentMothod();

	}

}
class Grnadparents{
	 void method() {
		System.out.println("i am the method of the grand parent");

	}
	 void mm() {
		System.out.println("booss");
	}
}

class Parent {
	String name;
	int w=20;

	// A method which prints the
	// signature of the parent class
	void method() {
		System.out.println("Method from Parent");
	}

	public void anotherParentMothod() {
		System.out.println("Another Method of parent");

	}
}

//Child class 
class Child extends Parent {
	int id;
	

	// Overriding the parent method
	// to print the signature of the
	// child class
	@Override
	void method() {
		System.out.println("Method from Child");
	}

	public void anotherChildMethod() {
		System.out.println("Another Mothod From Child");

	}
	@Override
	public void anotherParentMothod() {
		System.out.println("********");
		System.out.println("i am parent method but i am in thr child class");
//		super.anotherParentMothod();  
	}
}

//Demo class to see the difference 
//between upcasting and downcasting 
/*
 * public class GFG {
 * 
 * // Driver code public static void main(String[] args) { // Upcasting Parent p
 * = new Child(); p.name = "GeeksforGeeks";
 * 
 * // This parameter is not accessible // p.id = 1; System.out.println(p.name);
 * p.method();
 * 
 * // Trying to Downcasting Implicitly // Child c = new Parent(); - > compile
 * time error
 * 
 * // Downcasting Explicitly Child c = (Child)p;
 * 
 * c.id = 1; System.out.println(c.name); System.out.println(c.id); c.method(); }
 * }
 * 
 */
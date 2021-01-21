package com.Training.org;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListClass {
	public static void main(String[] args) {
		int a =10;
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add("lokesh");
		ar.add("master");
		ar.add("karan");
		ar.add("boss");
		//System.out.println(ar.get(1));
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		System.out.println(ar);
		ar.set(2, "keran");
		//System.out.println(ar.size());
		System.out.println(ar);
		System.out.println(ar.size());
		ar.add(2, "india");
		System.out.println(ar);
		System.out.println(ar.size());
		boolean contains = ar.contains("lokesh");
		System.out.println(contains);
		int indexOf = ar.indexOf("boss");
		System.out.println(indexOf);
		System.out.println(ar.remove(3));
		System.out.println(ar);
		ArrayList<String>ar1= new ArrayList<String>();
		ar1.add("frog");
		ar1.add("lokesh");
		ar1.add("boss");
		ar1.add("dog");
		ar1.add("Tree");
		System.out.println(ar1);
		System.out.println(ar.addAll(ar1));
		System.out.println(ar);
		System.out.println(ar1);
		/*for(Object str:ar) {
			System.out.println(str);
			gystem.out.println(it.next());
		}*/
			ar1.add("kangaru");
			System.out.println(ar1);
	}

}

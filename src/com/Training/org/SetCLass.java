package com.Training.org;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetCLass {
	public static void main(String[] args) {
		TreeSet<Integer>has= new TreeSet<Integer>();
		has.add(4);
		has.add(10);
		has.add(45);
		has.add(48);
		has.add(4);
		has.add(55);
		has.add(41);
		has.add(45);
		System.out.println(has);
		Iterator<Integer> it = has.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(has.descendingSet());
		System.out.println(has.last());
		Integer floor = has.floor(40);
		System.out.println(floor);
		Integer higher = has.higher(11);
		System.out.println(higher);
	}

}

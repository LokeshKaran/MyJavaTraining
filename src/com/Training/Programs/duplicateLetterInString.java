package com.Training.Programs;

import java.util.ArrayList;
import java.util.List;

public class duplicateLetterInString {
	public static void main(String[] args) {

		duplicatell();
	}

	public static void duplicatell() {
		String s = "great responsiblity";
		String[] split = s.split("");
		System.out.println("the length of the String is-->" + split.length); 
		List<String> ls = new ArrayList<String>();
		List<String> repeat = new ArrayList<String>();
		for (String sp : split) {
			if (ls.contains(sp)) {
				repeat.add(sp);
			} else {
				ls.add(sp);
			}
		}
		System.out.println(ls);
		System.out.println("The duplicate letter are");
		System.out.println(repeat);
	}

}

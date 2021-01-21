package com.Training.Programs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class repetativeWords {
	public static void main(String[] args) {
//		for the people by the people to the people

		String s = "for the people by the people to the people";
		String[] split = s.split(" ");
		System.out.println("the number of the words are -->" + split.length);
		Map<String, Integer> m = new LinkedHashMap<String, Integer>();
		for (String sp : split) {
			if (m.containsKey(sp)) {
				Integer in = m.get(sp);
				m.put(sp, in + 1);
			} else {
				m.put(sp, 1);

			}
		}
		System.out.println(m);
		Set<Entry<String, Integer>> entrySet = m.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if(entry.getValue()>1)
			System.out.println(entry);
		}
	}

}

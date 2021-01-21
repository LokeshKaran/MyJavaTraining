package com.Training.org;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Hashing {
	public static void main(String[] args) {
		HashMap<Integer, String> hass= new HashMap<Integer, String>();
		hass.put(2, "Lokesh");
		hass.put(5, "What to do ");
		hass.put(10, "kashmir");
		hass.put(2, "Karan");
		hass.put(6, "Delhi");
		hass.put(9, "Chenai");
		
		System.out.println(hass);
		boolean containsKey = hass.containsKey(5);
		System.out.println(containsKey);
		Set<Integer> keySet = hass.keySet();
		System.out.println(keySet);
		for(Integer arr:keySet) {
			System.out.println(arr);
			
		}
		
		hass.remove(6);
		System.out.println(hass);
		String string = hass.get(10);
		System.out.println(string);
		Set<Entry<Integer, String>> entrySet = hass.entrySet();
		for(Entry<Integer, String> ab:entrySet) {
			System.out.println(ab);
		}
		 hass.replace(2, "Karan", "Master");
		 System.out.println(hass);
		 boolean containsValue = hass.containsValue("Master");
		 System.out.println(containsValue);
	}
	
}

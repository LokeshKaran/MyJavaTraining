package com.Training.org;

import java.util.TreeSet;

public class Sample {

	public static void main(String[] args) {
		int a = 10;
		int b = 50;
		int c = 30;
		int d = 100;
		int e = 189;
		int f = 13;
		int[] arr = new int[6];
		int[] arr1 = new int[6];
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		arr[3] = d;
		arr[4] = e;
		arr[5] = f;
		int s = 1;
		int w = 0;
		int z = 1;
		while(z < arr.length)
		 {
			if (arr[z] > arr[s])
			{
				arr1[w] = arr[s];
				s++;
			} else if (arr[z] < arr[s])
			{
				arr1[w] = arr[z];
				s++;
			}
			
			System.out.println(arr[w]);
			w++;
			z++;
		}
		

	}

	public char[] gob;
	public char[] a;

}

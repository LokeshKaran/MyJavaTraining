package com.Training.org;

import com.Training.Programs.Factorial;

public class FinalClass {	
	final int aa = 10000;
	public static void main(String[] args) {
		Factorial.isFactorial(3);
		FinalClass fi = new FinalClass();
		System.out.println(fi.aa);
		fi.master();
		Done d= new Done();
	}
		public final void master() {
			System.out.println(" we are doing the final keyword practise");
			//  a++;
			System.out.println(" the next umber after the 10 :"+aa);
		}
}
 class Done{
	public Done() {
		System.out.println(" this is an constructor");
	}
}

package com.Training.org;

public class NormalClass implements Abstractclass,SuperCLass {

	@Override
	public void nameis(String h) {
		System.out.println(" the name of me is :"+h);
		
	}
	@Override
	public void age(int aa) {
		
		System.out.println(" the last name his karan");
	}
	public static void main(String[] args) {
		NormalClass no = new NormalClass();
		no.nameis("lokesh");
		no.age(23);
		no.studentBloos("B+ve");
		no.studentDept("Mechanical"); 
	}
	@Override
	public void studentDept(String a) {
		System.out.println("the dept of the student is :"+a);
		
	}
	@Override
	public void studentBloos(String bll) {
		System.out.println("the blood of the student is:"+bll);
	}

}

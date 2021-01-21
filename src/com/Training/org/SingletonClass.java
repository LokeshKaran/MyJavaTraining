package com.Training.org;

public class SingletonClass {

	private static SingletonClass instance;

	private SingletonClass() {
		System.out.println("i am singleton class");
	}

	public static SingletonClass getInstance() {
		if (instance == null) {
			instance = new SingletonClass();
		}
		return instance;
	}

	public static void main(String[] args) {

		SingletonClass a = SingletonClass.getInstance();
		System.out.println(a);
		SingletonClass b = SingletonClass.getInstance();
		System.out.println(b);
		SingletonClass c = SingletonClass.getInstance();
		System.out.println(c);

	}

}

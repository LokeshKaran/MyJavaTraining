package com.Training.org;

public class LocalVarible {
		String nameTeachers;
		 static int num = 25;
	public static void main(String[] args) {
		LocalVarible local= new LocalVarible();
		
		local.teachers();
		student();
		
			
	}	
		public static void student() {
			String name = "Lokesh";
			
			System.out.println("the name of the student is "+name);
			//System.out.println("the teacher name is "+nameTeachers);
			System.out.println("the number mentioned is "+num);
		}
		public void teachers() {
			nameTeachers="master";
			System.out.println("the name of the teaches is "+nameTeachers);
			System.out.println("the value of the number is "+num);
 
		}
}

package com.Training.org;

public class Employee {
	public Employee(String name) {
		System.out.println("name of the employee"+name);
	}
	int age ;
	String designation;
	String dept;
	
	public static void main(String[] args) {
		Employee emp= new Employee("Lokesh");
		Employee empp = new Employee("master");
		emp.empAge(26);
		emp.empDesig("sales");
		emp.department("BD");
		empp.empAge(21);
		empp.empDesig("automation tester");
		empp.department("quality");
		emp.finalPrint();
		empp.finalPrint();
		
	}
	private void empAge(int emppAge) {
		age= emppAge;
	}
	private void empDesig(String emppDesig) {
		designation= emppDesig;

	}
	private void department(String depp) {
		dept = depp;

	}
	private void finalPrint() {
		System.out.println("employee age is :"+age);
		System.out.println("employee Designation is:"+designation);
		System.out.println("employee department is "+dept);
	}

}

package com.sonata.Day4;

public class UserEmployee {
	public static void main(String args[])
	 {
		 
		Employee emp = new Employee(18306,"hampi",34556);
		Employee emp2= new Employee(18305,"bhagya",46656);
		Employee emp3=new Employee(18318,"sonu",37556);
		 
		 EmployeeImpl em= new EmployeeImpl();
		 em.addEmployee(emp);
		 em.addEmployee(emp2);
		 em.addEmployee(emp3);
		 
		 em.deleteEmployee(emp);
		 
		double sal= em.appSalary(emp);
		System.out.println("App salary of employee = "+sal);
		
		
		double sal1= em.yearSalary(emp3);
		System.out.println("yearly salary of employee = "+sal1);
	 }


}

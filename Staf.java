package com.sonata.Day3;

public class Staf extends Employee {
	public void calculateSalary()
	{
		double hra=BasicPay*0.18;
		double salary=BasicPay+hra;
		System.out.println("the salary of staff:"+salary);
	}
	 void display()
		{
			System.out.println("EmployeeId:"+empId);
			System.out.println("EmployeeId:"+empName);
		}


}

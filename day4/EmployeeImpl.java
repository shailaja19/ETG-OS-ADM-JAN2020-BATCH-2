package com.sonata.Day4;

import java.util.ArrayList;
import java.util.LinkedList;

public class EmployeeImpl implements EmployeeInt {
	
	public void addEmployee(Employee emp)
	{
		LinkedList<Employee> ls=new LinkedList<Employee>();
		ls.add(emp);
		System.out.println(ls);
		
		
		
		
	}
	public void deleteEmployee(Employee emp2)
	{
		LinkedList<Employee> ls=new LinkedList<Employee>();
			ls.add(emp2);
		    ls.remove(emp2);
			System.out.println(emp2);
		}
	public double appSalary(Employee e1)
	{
		if(e1.empSal<10000)
		{
			e1.empSal=e1.empSal+5000;
		}
		return e1.empSal;
	}
	
	public double yearSalary(Employee e2)
	{
		return e2.empSal*12;
	}

}

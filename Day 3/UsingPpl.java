package com.sonata.Day3;

public class UsingPpl {
	public static void main(String args[])
	{
		Address a1=new Address();
		a1.setCity("bangalore");
		a1.setDoorNo(15);
		a1.setPin(560027);
		a1.setStreet("madhavan park");
		TechEmpl emp=new TechEmpl();
		emp.setBasicPay(3000);
		emp.setEmpId(123);
		emp.setEmpName("sonu");
		emp.setNol(5);
		emp.setObj(a1);
		emp.display();
		
		emp.calculateSalary();
		
		
	Staf sf=new Staf();
	sf.setBasicPay(5000);
	sf.setEmpName("hampi");
	sf.setEmpId(18306);
	sf.calculateSalary();
	sf.display();
	}


}

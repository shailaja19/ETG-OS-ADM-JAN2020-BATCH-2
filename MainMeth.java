package com.sonata.Day3;

public class MainMeth {

	public static void main(String[] args) {
		
		Empl e1 = new Empl();
		e1.empId = 123;
		e1.empName = "abc";
		e1.empSal = 23244;
		
		e1.display();
		e1.salCal();
		
		Manager m = new Manager();
		m.empSal = 234345;
		m.salCal();
		
		Developer d = new Developer();
		d.empSal = 4654;
		d.salCal();
		
		Tester t = new Tester();
		t.empSal = 76564;
		t.salCal();
		

	}


}

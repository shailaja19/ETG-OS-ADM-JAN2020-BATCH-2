package com.sonata.Day3;

public class Squar extends Shap {
	
	Squar(double d, double e, double f) {
		super(d, e, f);
		// TODO Auto-generated constructor stub
	}

	public void area()
	{
		double area = length*length*length*length;
		System.out.println("the square area is "+area);
	}


}

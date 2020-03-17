package com.sonata.Day3;

public class Triangl extends Shap {
	
	Triangl(double d, double e, double f) {
		super(d, e, f);
		// TODO Auto-generated constructor stub
	}

	public void area()
	{
		double area = 0.5*length*heigth;
		System.out.println("the triangle area is "+area);
	}

}

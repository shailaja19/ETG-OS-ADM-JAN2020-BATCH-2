package com.sonata.Day3;

public class rectangl extends Shap {
	
	
	rectangl(double length, double heigth, double width) {
		super(length, heigth, width);
		// TODO Auto-generated constructor stub
	}

	public void area()
	{
		double area=0;
		area = length*width;
		System.out.println("the rectangle area is "+area);
	}

}

package com.sonata.Day3;

public class CustomEx {
	
	public static void main(String[] args) throws MyOwnException {
		int sal = 16000;
		if(sal<100000)
		{
			throw new MyOwnException("your salary is less than min balance");
		}
		else
		{
			System.out.println("your salary is displyed");
		}
		

	}


}

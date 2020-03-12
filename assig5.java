package com.sonata;

import java.util.Scanner;

public class assig5 {


	public static void main(String[] args) 
	{
		int ar[]= {1,2,3,4,5};
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the j value");
		int j= sc.nextInt();
		int c=0;
			for(int i=0;i<ar.length;i++)
			{
				if(j==ar[i])
				{
					c=1;
				}
			}
				if(c==1)
				{
					System.out.println("contains the value");
				}
				else
				{
					System.out.println("not contain the value");
				}
					
			

	}

}

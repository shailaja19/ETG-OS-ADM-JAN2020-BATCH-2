package com.sonata.day2;

public class Stdclass {

		int stdId;
		String stdName;
		String stdclass;
		public void display(int stdId, String stdName, String stdclass)
		{
			System.out.println(stdId);
			System.out.println(stdName);
			System.out.println(stdclass);
		}

		public static void main(String[] args)
		{
			Stdclass s1=new Stdclass();
			Stdclass s2=new Stdclass();
			s1.display(18306,"hampi","etg");
			System.out.println();
			s2.display(18305,"bhagya","etg");
		}

	}


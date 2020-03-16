package com.sonata.day2;

public class ProClass 
{

		int proId;
		String ProName;
		float proPrice;
		double totalPrice;
		public ProClass(int Id, String Name, float Price)
		{
			this.proId = Id;
			this.ProName = Name;
			this.proPrice = Price;
			totalPrice = Price + Price*.18;
		}
		public void display()
		{
			System.out.println(proId+" "+ProName+ " "+ totalPrice);
		}

		public static void main(String[] args)
		{
			ProClass p1 = new ProClass(1, " redmi mobile", 15000);
			p1.display();
		}

	}


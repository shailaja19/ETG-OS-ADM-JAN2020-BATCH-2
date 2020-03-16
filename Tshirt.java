package com.sonata.day2;

public class Tshirt {

		String color;
		String material;
		String design;
		public Tshirt(String color, String  material, String design)
		{
			this.color = color;
			this. material =  material;
			this.design = design;
		}
		public void display()
		{
			System.out.println(color+" "+material+" "+design);
		}
		public static void main(String[] args)
		{
			Tshirt small = new Tshirt("violet", " cotton", "half sleev");
			Tshirt large = new Tshirt("black", " silk", "round neck");
			Tshirt ex_large = new Tshirt("white", " semi cotton", "full sleev");
			small .display();
			large .display();
			ex_large .display();
		}

	}


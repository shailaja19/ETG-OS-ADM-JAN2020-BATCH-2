package com.sonata.Day5;

public class SavingAcc implements Bank {
	int accNo;
	String accName;
	 double accBalance;
	
	SavingAcc() {}
	
	
	
	public SavingAcc(int accNo, String accName,double accBal) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.accBalance=accBal;
	}



	public double deposite(double  amount)
	{
		
		System.out.println("Saving Account Deposited");
		accBalance= accBalance+amount;
		return accBalance;
	}
	
	public double withDraw(double  amount)
	{
		accBalance= accBalance-amount;
		return accBalance;
	}
	

}

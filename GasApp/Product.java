package com.sonata;

public class Product {
	int proID;
	String proName;
	double proPrice;
	public int getProID() {
		return proID;
	}
	public void setProID(int proID) {
		this.proID = proID;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public double getProPrice() {
		return proPrice;
	}
	public void setProPrice(double proPrice) {
		this.proPrice = proPrice;
	}
	@Override
	public String toString() {
		return "Product [prdID=" + proID + ", prdName=" + proName + ", prdPrice=" + proPrice + "]" + "\n";
	}
	
	
	

}

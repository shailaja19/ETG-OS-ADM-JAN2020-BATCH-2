package com.sonata.Model;

public class Student {
	
	int StdId;
	String StdName;
	double Marks;
	public int getStdId() {
		return StdId;
	}
	public void setStdId(int stdId) {
		StdId = stdId;
	}
	public String getStdName() {
		return StdName;
	}
	public void setStdName(String stdName) {
		StdName = stdName;
	}
	public double getMarks() {
		return Marks;
	}
	public void setMarks(double marks) {
		Marks = marks;
	}
	@Override
	public String toString() {
		return "Student [StdId=" + StdId + ", StdName=" + StdName + ", Marks=" + Marks + "]";
	}
	public void addBatch() {
		// TODO Auto-generated method stub
		
	}
	public void executeBatch() {
		// TODO Auto-generated method stub
		
	}
	

}

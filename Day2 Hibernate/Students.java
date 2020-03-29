package com.sonata;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Student1")
public class Students {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int stdId;
	private String stdName;
	private int marks;
	
	@ManyToOne
	@JoinColumn(name="addId")
	private Address stdAddress;

	@ManyToOne
	@JoinColumn(name="shoolId")
	School school;
	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public Address getStdAddress() {
		return stdAddress;
	}

	public void setStdAddress(Address stdAddress) {
		this.stdAddress = stdAddress;
	}
	

}

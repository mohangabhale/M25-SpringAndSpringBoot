package org.tnsindia.di3withcollection;

import java.util.List;

public class StudentNew {
	private String name;
	private String rollNo;
	private List<Address> address;
	
	public StudentNew(List<Address> address){
		this.address = (List<Address>) address;
	}
 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	
	public List<Address> getAddress() {
		return address;
	}	
	
}

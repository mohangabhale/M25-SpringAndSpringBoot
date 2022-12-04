package com.example.demo;

import org.springframework.stereotype.Component;

/*below annotation is use to denote that a class is 
component *it allows spring to automatically detect custom bean*/
@Component
public class Student {
	//private data members
	private int rollno;
	private String name;
	
	/*public int getRollno() {
		return rollno;*/
	
	//setters and getters method to access private data members
	//DI using Setters 
	
	
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	/*public String getName() {
		return name;
	}*/
	public void setName(String name) {
		this.name = name;
	}
	
	//user defined method
	public void print()
	{
		System.out.println("Welcom to M25 batch");
	}
	//Default constructor
	public Student() {
		super();
		System.out.println("Welcom to TNS INDIA Foundation");

	}
	
	
	
	

}

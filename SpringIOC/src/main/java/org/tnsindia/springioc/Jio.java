package org.tnsindia.springioc;

public class Jio implements Sim{

	public void calling() {
		System.out.println("calling using Jio");
		
	}

	public void data() {
		System.out.println("Internet using Jio");
		
	}
	//Constructor

		public Jio() {
			super();
			System.out.println("Jio class Constructor");
		}

}

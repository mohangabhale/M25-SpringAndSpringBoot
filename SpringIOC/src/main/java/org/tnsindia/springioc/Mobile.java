package org.tnsindia.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		//creating the object
		/*Airtel a=new Airtel();
		a.calling();
		a.data();
		
		//creating the object for jio
		Jio j=new Jio();
		j.calling();
		j.data();*/
		
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("config..loaded");
		
		Sim a=c.getBean("sim",Sim.class);
		a.calling();
		a.data();
		
		/*Jio j=(Jio)c.getBean("jio");
		j.calling();
		j.data();*/
	}

}

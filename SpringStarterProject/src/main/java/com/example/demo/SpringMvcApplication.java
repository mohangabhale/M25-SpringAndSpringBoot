package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class SpringMvcApplication {

	public static void main(String[] args) {
		/*int x=20;
		System.out.println("The value of x is: "+x);*/
		
		/*Student s=new Student();
		s.print();*/
		
		/*Employee e=new Employee();
		e.print();*/
		
		//IOC and DI
		ConfigurableApplicationContext c = SpringApplication.run(SpringMvcApplication.class, args);
		Student e=c.getBean(Student.class);
		e.print();
		
	}

}

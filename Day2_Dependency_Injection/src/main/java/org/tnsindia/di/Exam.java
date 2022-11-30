package org.tnsindia.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		//hard coding
		//Student s=new Student();
		//s.setStudentName("Mohan Gabhale");
		//s.display();

		//usign IOC
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		Student s1=c.getBean("s1",Student.class);
		//Student s2=c.getBean("s2",Student.class);
		s1.display();
		//s2.display();		
	}

}

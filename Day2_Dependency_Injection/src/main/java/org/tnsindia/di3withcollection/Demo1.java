package org.tnsindia.di3withcollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo1 {

	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
		
		Cars def = (Cars) c.getBean("def");
		def.display();

	}
		

}
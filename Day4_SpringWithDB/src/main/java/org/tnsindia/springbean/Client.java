package org.tnsindia.springbean;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//driver class
public class Client {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		/*StudentDAO obj=new StudentDAO();
		obj.selectAllRows();*/
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		StudentDAO s1=c.getBean("studentdao",StudentDAO.class);
		s1.selectAllRows();

	}

}

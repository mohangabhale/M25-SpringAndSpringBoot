package org.tnsindia.di;

public class Student {
	
		
		//Data memnbers
		//1.DI in terms of literals
		private String StudentName;
		private int RollNo;

		
		public void display()
		{
			System.out.println("The name of the Student is:" +StudentName);
			System.out.println("The roll no. of the Student is:" +RollNo);

		}
		/*Acheving the dependancy by using constructor*/


		public Student(String studentName, int rollNo) {
			super();
			StudentName = studentName;
			RollNo = rollNo;
		}
		

		
		
		/*Acheving the dependancy by using setters*/
		//DI using setters	
		/*public void setStudentName(String studentName) {
			StudentName = studentName;
		}

		public void setRollNo(int rollNo) {
			RollNo = rollNo;
		}*/
		

		

}

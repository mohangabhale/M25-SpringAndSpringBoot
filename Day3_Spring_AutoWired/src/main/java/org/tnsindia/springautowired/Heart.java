package org.tnsindia.springautowired;

public class Heart {
	
	//Dependency in terms of literals
		private String nameOfAnimal;
		private int noOfHeart;
		
		//getters and setters
		
		public String getNameOfAnimal() {
			return nameOfAnimal;
		}



		public void setNameOfAnimal(String nameOfAnimal) {
			this.nameOfAnimal = nameOfAnimal;
		}



		public int getNoOfHeart() {
			return noOfHeart;
		}



		public void setNoOfHeart(int noOfHeart) {
			this.noOfHeart = noOfHeart;
		}



		//method
		public void pump()
		{
			System.out.println("Your heart is pumping");
			System.out.println("You are alive!");
		}
		


}

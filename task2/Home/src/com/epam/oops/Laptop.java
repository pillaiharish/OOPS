package com.epam.oops;

public class Laptop implements Appliances {
	private int numberOfHours;
	private int unitOfEach=4;
	
	public Laptop(int numHrs) {
		this.numberOfHours=numHrs;
	}
	
	@Override
	public int consumption() {
		int power = numberOfHours * unitOfEach;
		
		return power;
	}

}

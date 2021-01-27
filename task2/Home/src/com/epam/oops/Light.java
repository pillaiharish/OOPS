package com.epam.oops;

public class Light implements Appliances {
	private int numberOfHours;
	private int unitOfEach=2;
	
	public Light(int numHrs) {
		this.numberOfHours=numHrs;
	}
	
	@Override
	public int consumption() {
		int power = numberOfHours * unitOfEach;
		
		return power;
	}

}

package com.epam.oops;

public class TV implements Appliances {
	private int numberOfHours;
	private int unitOfEach=3;
	
	public TV(int numHrs) {
		this.numberOfHours=numHrs;
	}
	
	@Override
	public int consumption() {
		int power = numberOfHours * unitOfEach;
		
		return power;
	}

}

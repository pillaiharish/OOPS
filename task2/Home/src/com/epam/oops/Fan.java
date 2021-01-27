package com.epam.oops;

public class Fan implements Appliances {
	private int numberOfHours;
	private int unitOfEach=1;
	
	public Fan(int numHrs) {
		this.numberOfHours=numHrs;
	}
	
	@Override
	public int consumption() {
		int power = numberOfHours * unitOfEach;
		
		return power;
	}

}

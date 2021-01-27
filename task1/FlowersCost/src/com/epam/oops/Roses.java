package com.epam.oops;

public class Roses extends Flower {
	private int numberOfRoses;
	private int costOfEach=1;
	
	public Roses(int num){
		this.numberOfRoses = num;
	}
	
	public int getCost() {
		return cost(numberOfRoses, costOfEach);
	}


}

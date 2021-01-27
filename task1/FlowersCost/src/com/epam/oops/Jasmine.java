package com.epam.oops;

public class Jasmine extends Flower{
	private int numberOfJasmine;
	private int costOfEach=2;
	
	public Jasmine(int num) {
		this.numberOfJasmine=num;
	}
	
	public int getCost() {
		return cost(numberOfJasmine,costOfEach);
	}
	

}

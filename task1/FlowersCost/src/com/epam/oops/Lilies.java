package com.epam.oops;

public class Lilies extends Flower {
	private int numberOfLilies;
	private int costOfEach=3;
	
	public Lilies(int num) {
		this.numberOfLilies=num;
	}

	public int getCost() {
		return cost(numberOfLilies,costOfEach);
	}

}

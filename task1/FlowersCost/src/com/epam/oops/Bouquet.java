package com.epam.oops;

import java.util.Scanner;

public class Bouquet {
	public int BouquetCost() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Roses: ");
		int inputRoses=sc.nextInt();
		Roses rose = new Roses(inputRoses);
		
		System.out.println("Enter number of Jasmines: ");
		int inputJasmine=sc.nextInt();
		Jasmine jasmine=new Jasmine(inputJasmine);
		
		System.out.println("Enter number of Lilies: ");
		int inputLilies = sc.nextInt();
		Lilies lily = new Lilies(inputLilies);
		sc.close();
		
		int totalCostOfBouquet=rose.getCost()+jasmine.getCost()+lily.getCost();
		return totalCostOfBouquet;
	}
	public static void main(String[] args) {
		Bouquet bouquetObj=new Bouquet();
		System.out.println("Cost of Bouquet is: "+bouquetObj.BouquetCost());
	}

}
/* Program output:
 
	Enter number of Roses: 
	3
	Enter number of Jasmines: 
	3
	Enter number of Lilies: 
	3
	Cost of Bouquet is: 18
 */

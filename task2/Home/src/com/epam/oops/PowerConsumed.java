package com.epam.oops;

import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;


public class PowerConsumed {
	private Map<String,Integer> map = new HashMap<String, Integer>();
	public void CalculatePower() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the usage (in hours) for each appliances below: ");
		
		System.out.println("Fan ");
		int fanDuration= sc.nextInt();
		Fan fanObj = new Fan(fanDuration);
		
		System.out.println("Light ");
		int lightDuration = sc.nextInt();
		Light lightObj = new Light(lightDuration); 
		
		System.out.println("TV ");
		int tvDuration = sc.nextInt();
		TV tvObj = new TV(tvDuration);
		
		System.out.println("Laptop");
		int laptopDuration = sc.nextInt();
		Laptop laptopObj = new Laptop(laptopDuration);
		sc.close();
		
		int currentLoad = fanObj.consumption()+lightObj.consumption()+tvObj.consumption()+laptopObj.consumption();
		System.out.println("Current Load of House is: "+currentLoad);
		map.put("fan",fanObj.consumption());
		map.put("light",lightObj.consumption());
		map.put("tv",tvObj.consumption());
		map.put("laptop",laptopObj.consumption());
		
		List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(map.entrySet());
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> x, Entry<String, Integer> y){
				return x.getValue().compareTo(y.getValue());
			}
		});
		
		System.out.println("Following is the sorted form of Appliances as per the total power consumed");
		for(Entry<String,Integer> item: list) {
			System.out.println(item);
		}
	
	}
	public static void main(String[] args) {
		PowerConsumed pc=new PowerConsumed();
		pc.CalculatePower();
	}

}

/*
 * Program output:
	Please enter the usage (in hours) for each appliances below: 
	Fan 
	3
	Light 
	3
	TV 
	3
	Laptop
	3
	Current Load of House is: 30
	Following is the sorted form of Appliances as per the total power consumed
	fan=3
	light=6
	tv=9
	laptop=12
 */

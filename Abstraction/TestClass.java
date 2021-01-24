// Interface in java 

package com.epam.oops;

import java.io.*; 

interface InterfaceOne 
{ 
	final int a = 10; 

	void display(); 
} 


class TestClass implements InterfaceOne
{ 
	
	public void display() 
	{ 
		System.out.println("Geek"); 
	} 

	
	public static void main (String[] args) 
	{ 
		TestClass t = new TestClass(); 
		t.display(); 
		System.out.println(a); 
	} 
} 

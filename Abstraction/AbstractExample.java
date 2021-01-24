// An Abstract class in java
abstract class Base { 
	Base() { System.out.println("Base Constructor Called"); } 
	abstract void function(); 
} 

class Derived extends Base { 
	Derived() { 
		System.out.println("Derived Constructor Called"); 
	} 

	void function() { 
		System.out.println("Derived fun() called"); 
	} 
} 

class AbstractExample { 
	public static void main(String args[]) { 
		Derived d = new Derived(); 
	} 
}
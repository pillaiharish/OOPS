/*
	Achieving overloading by change in data type of arguments
*/
class Adder{  
	static int add(int a, int b){return a+b;}  
	static double add(double a, double b){return a+b;}  
}  
class ChangeDataTypeOfArguments{  
	public static void main(String[] args){  
		System.out.println(Adder.add(11,11));  
		System.out.println(Adder.add(12.3,12.6));  
	}
}  
/*Output
	22
	24.9
*/
package day5;

public class ConstructorDemo2 {
	// instance variable(non-static variable), data, memebr's data, properties
	// attributes
	int age;
	String name;
	
	
	public void displayinfo() {
		
		System.out.println("name id: " + name);
		System.out.println("age is: " + age);
	}
	
	// n and a are known as local variable 
	public void assignInfo (String n, int a) {
		name = n;
		age = a ;	
		
	}
	public static void main (String [] args) {
		ConstructorDemo2 ob1 = new ConstructorDemo2();
		ob1.assignInfo("josh Long", 22);
		ob1.displayinfo();	
		System.out.println("================");
		ConstructorDemo2 ob2 = new ConstructorDemo2();
		ob2.assignInfo("josh Wang", 3);
		ob2.displayinfo();	
	}
	
	

}

package day5;

// constructor overloading
public class ConstructorDemo3 {
	
	String name;
		int age;
	public ConstructorDemo3() {
		System.out.println("default constructor");
		
	}
    public ConstructorDemo3(String name) {
	 System.out.println(" 1. parametrized constractor");
    }
    public ConstructorDemo3(int age) {
    	System.out.println(" 2. parametrized constractor");
	   
   }
    public ConstructorDemo3(String name, int age) {
    	this.name = name;
    	this.age = age;
    	System.out.println(" 2. parametrized constractor");
    }
    public static void main(String [] args) {
    	ConstructorDemo3 ob1 = new ConstructorDemo3();
    	ConstructorDemo3 ob2 = new ConstructorDemo3(22);
    	ConstructorDemo3 ob3 = new ConstructorDemo3("rr");
    	ConstructorDemo3 ob4 = new ConstructorDemo3("ee", 22);
    }
    
}

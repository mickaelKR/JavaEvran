package day5;

public class ObjectDemo2 {

	

    int a = 5;
    int b = 15000;
    int sum = a+b;
    
    // methods
    public void greet() {
    	System.out.println("Hello");
    	System.out.println("Good Morning Virginia");
    }
    public static void main(String [] args) {
    	
    	ObjectDemo2 ob = new ObjectDemo2();
    	System.out.println(ob.sum);
    	ob.greet();
    }

	}



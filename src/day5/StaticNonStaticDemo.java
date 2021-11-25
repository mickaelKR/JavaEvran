package day5;

public class StaticNonStaticDemo {
   //this is non-static variable
	String name = "john Smith";
	
	// this is static variable 
	static String address = "Huston, Teaxs, USA";
	
	// non-static method
	public void sayHello() {
		System.out.println("Hello Helloo Helllo");
	}
	// static method
	public static void greet() {
		System.out.println("good envning");
}

	
	public static void main(String[] args) {
		StaticNonStaticDemo obj = new StaticNonStaticDemo();
		System.out.println(obj.name);
		obj.sayHello();
		
		System.out.println(address);
		System.out.println(StaticNonStaticDemo.address);
		greet();
		StaticNonStaticDemo.greet();
		
	}
	

}

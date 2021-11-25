package day5;

public class taticNonStaticDemoTest {

	
	public static void main(String[] args) {
		StaticNonStaticDemo obj = new StaticNonStaticDemo();
		System.out.println(obj.name);
		obj.sayHello();
		
	
		System.out.println(StaticNonStaticDemo.address);
		
		StaticNonStaticDemo.greet();
		
	
	}
}

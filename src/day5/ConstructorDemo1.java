package day5;

public class ConstructorDemo1 {

	 public void sayHello() {
		 System.out.println("hellooooo");
	 }
	 public ConstructorDemo1() {
		 System.out.println("this is constructor ....");
		 
	 }
	 public static void main(String [] args) {
		 ConstructorDemo1 ob =new ConstructorDemo1();
		 ob.sayHello();
	 }
	 
}

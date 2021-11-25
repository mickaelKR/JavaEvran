package day5;

public class MethodDemo1 {

		// <access modifier> void <method name> () {
		//
		//====
		//====
	//}
		
		// this is declaration/definition 
		public void sayHello() {
			System.out.println("helllooo..");
			
			// <access modifier> void <metgod name> ( any number of parameters) {
			//
			// ====
			//    ====
			 }
			public void displayInfo(String name, int age, double salary) {
				System.out.println("name is: " + name);
				System.out.println("age is: " + age);
				System.out.println("salary is: " + salary);
				System.out.println("==========");
			
		}
		public static void main(String[] args) {
		MethodDemo1 methodDemo = new MethodDemo1();
		// this is calling
		methodDemo.sayHello();
		
		String name = "jack";
		int age = 33;
		double salary = 4567.89;
		methodDemo.displayInfo(name, age, salary);
		methodDemo.displayInfo("kaju", 12, 100000);
		System.out.println("end");
		
	}
}

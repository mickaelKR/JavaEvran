package day5;

public class MethodDemo2 {
	
	// <access modifier> <return type of any data type> < method name> (){
	//
	//  ===
	//      ====
	// return value matching with declared return type
	// }
	 public int addition () {
		 int a = 5;
		 int b = 6;
		 int sum = a + b;
			 return sum;	 
	 }
	 public int findMax(int a, int b) {
		 int max =0;
		 if (a > b ) {
			 max = a;
		 }else {
			 max = b;
		 }
		 return max;
		 }
	 
	public static void main ( String [] args) {
		MethodDemo2 methodDemo = new MethodDemo2();
		System.out.println(methodDemo.addition());
		int sum = methodDemo.addition();
		System.out.println(sum);
		
		int a = 5;
		int b = 4;
		int max = methodDemo.findMax(a, b);
		System.out.println(max);
		
	}
			

}

package day4;

public class ElseIfDemo {

	public static void main(String[] args) {
		
		int marks = 5;
		if(marks > 80 && marks <=100) {
			System.out.println("Distinction");
		}
		else if (marks >60 && marks <=79) {
		 System.out.println("first");
		}
	else if (marks >50 && marks <= 59) {
       System.out.println("Second");
	}
   else if (marks > 40 && marks <=49) {
	System.out.println("Third");
}else {
	System.out.println("fail");
}
 System.out.println("==========");
 System.out.println("===============");
 }
}

package day3;

import java.util.Scanner;

public class ConsoleInputDemo1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter value of a: ");
		int a = input.nextInt();
		System.out.println("Enter value of b: ");
		int b = input.nextInt();
		int sum = a + b;
		System.out.println("Sum is: " + sum);
		
		System.out.println("Enter value of x:");
		double x = input.nextDouble();
		System.out.println("Enter value of y:");
		double y = input.nextDouble();
		double mul = x * y;
		System.out.println("Multiplication is: " + mul);
		
		

	}

}

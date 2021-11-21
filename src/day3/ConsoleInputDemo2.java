package day3;

import java.util.Scanner;

public class ConsoleInputDemo2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner input = new Scanner(System.in);
  System.out.println("Enter name");
  String name = input.next();
  System.out.println("Name is: " + name);
  input.nextLine();
  System.out.println("Enter full name: ");
  String fullName  = input.nextLine();
  System.out.println("Full name is: "+ fullName);
  
  System.out.println("Enter any character: ");
  char c = input.next().charAt(0);
  System.out.println("Entered character is:" + c );
  
  
  
  
  
	}

}

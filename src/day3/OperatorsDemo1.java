package day3;

public class OperatorsDemo1 {

	public static void main(String[] args) {
		// 1. Arithmetic Operators + - / * %(modulus)
		
		// Precedence * / % (high) + -(low)
		// associativity: Left to Right
		
		int a = 5 + 4 - 3 * 2 + 4 / 2 - 7 % 3;
	//  a = 5 + 4 - 6 + 4 / 2 - 7 % 3;
	//  a = 5 + 4 - 6 + 2 - 7 % 3;
	//  a = 5 + 4 - 6 + 2 - 1;
	//  a = 9 - 6 + 2 - 1;
	//  a = 3 + 2 - 1; 
	//  a = 5 - 1;
	//  a = 4;
		System.out.println(a);
		
		

	}

}
